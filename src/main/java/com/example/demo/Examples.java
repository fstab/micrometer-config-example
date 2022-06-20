package com.example.demo;

import io.micrometer.core.annotation.Counted;
import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.*;
import io.micrometer.core.instrument.config.MeterFilter;
import io.micrometer.core.instrument.distribution.DistributionStatisticConfig;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.time.Duration;
import java.util.Random;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Examples {

    private final Random random = new Random(0);
    private final Counter counter;
    private final Timer timer;

    public Examples(MeterRegistry registry) {
        registry.config().meterFilter(new MeterFilter() {
            @Override
            public DistributionStatisticConfig configure(Meter.Id id, DistributionStatisticConfig config) {
                if (id.getName().equals("example3.timer")) {
                    return DistributionStatisticConfig.builder()
                            .percentiles(0.5, 0.95, 0.99)
                            .percentilePrecision(1)
                            // Custom bucket boundaries are called "service level objectives" in Micrometer
                            .serviceLevelObjectives(
                                    MILLISECONDS.toNanos(20),
                                    MILLISECONDS.toNanos(40),
                                    MILLISECONDS.toNanos(60),
                                    MILLISECONDS.toNanos(80))
                            .build()
                            .merge(config);
                }
                return config;
            }
        });
        timer = Timer.builder("example6.timer")
                .description("example6")
                .publishPercentiles(0.5, 0.9, 0.95)
                .serviceLevelObjectives(
                        Duration.ofMillis(20),
                        Duration.ofMillis(40),
                        Duration.ofMillis(60)
                )
                .register(registry);
        counter = Counter.builder("example6.counter")
                .description("example6")
                .tags("key1", "value1", "key2", "value2")
                .register(registry);
    }

    @Timed("example1.timer")
    @Counted(value = "example1.counter")
    public void example1() throws InterruptedException {
        Thread.sleep(random.nextInt(100));
    }

    @Timed(value = "example2.timer",
            description = "Example timer",
            extraTags = {
                    "key1", "value1",
                    "key2", "value2"
            },
            percentiles = {0.5, 0.95, 0.98, 0.99},
            histogram = true
    )
    @Counted(value = "example2.counter",
            description = "Example counter",
            extraTags = {
                    "key1", "value1",
                    "key2", "value2"
            })
    public void example2() throws InterruptedException {
        Thread.sleep(random.nextInt(100));
    }

    // Programmatic configuration in constructor
    @Timed("example3.timer")
    @Counted(value = "example3.counter")
    public void example3() throws InterruptedException {
        Thread.sleep(random.nextInt(100));
    }

    // Configuration in application.properties
    @Timed("example4.timer")
    @Counted(value = "example4.counter")
    public void example4() throws InterruptedException {
        Thread.sleep(random.nextInt(100));
    }

    public void example5() {
        Metrics.counter("example5.counter", Tags.of("key1", "value1")).increment();
        Metrics.timer("example5.timer", Tags.of("key1", "value1"))
                .record(Duration.ofMillis(random.nextInt(100)));
    }

    public void example6() {
        counter.increment();
        timer.record(random.nextInt(), MILLISECONDS);
    }
}
