# Micrometer Config Examples

Examples of how to configure Micrometer metrics in Spring Boot.

See [src/main/java/com/example/demo/Examples.java](https://github.com/fstab/micrometer-config-example/blob/main/src/main/java/com/example/demo/Examples.java).

# Example Output

## Example 1

```
# HELP example1_counter_total  
# TYPE example1_counter_total counter
example1_counter_total{class="com.example.demo.Examples",exception="none",method="example1",result="success",} 11.0
# HELP example1_timer_seconds  
# TYPE example1_timer_seconds summary
example1_timer_seconds_count{class="com.example.demo.Examples",exception="none",method="example1",} 11.0
example1_timer_seconds_sum{class="com.example.demo.Examples",exception="none",method="example1",} 0.557758987
# HELP example1_timer_seconds_max  
# TYPE example1_timer_seconds_max gauge
example1_timer_seconds_max{class="com.example.demo.Examples",exception="none",method="example1",} 0.091503155
```

## Example 2

```
# HELP example2_timer_seconds_max Example timer
# TYPE example2_timer_seconds_max gauge
example2_timer_seconds_max{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",} 0.088378768
# HELP example2_timer_seconds Example timer
# TYPE example2_timer_seconds histogram
example2_timer_seconds{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",quantile="0.5",} 0.0
example2_timer_seconds{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",quantile="0.95",} 0.0
example2_timer_seconds{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",quantile="0.98",} 0.0
example2_timer_seconds{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",quantile="0.99",} 0.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.001",} 0.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.001048576",} 0.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.001398101",} 0.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.001747626",} 0.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.002097151",} 0.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.002446676",} 0.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.002796201",} 0.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.003145726",} 0.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.003495251",} 0.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.003844776",} 0.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.004194304",} 0.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.005592405",} 0.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.006990506",} 0.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.008388607",} 0.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.009786708",} 0.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.011184809",} 0.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.01258291",} 0.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.013981011",} 0.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.015379112",} 0.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.016777216",} 1.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.022369621",} 2.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.027962026",} 2.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.033554431",} 3.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.039146836",} 3.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.044739241",} 3.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.050331646",} 4.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.055924051",} 5.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.061516456",} 7.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.067108864",} 9.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.089478485",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.111848106",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.134217727",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.156587348",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.178956969",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.20132659",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.223696211",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.246065832",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.268435456",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.357913941",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.447392426",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.536870911",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.626349396",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.715827881",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.805306366",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.894784851",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="0.984263336",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="1.073741824",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="1.431655765",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="1.789569706",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="2.147483647",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="2.505397588",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="2.863311529",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="3.22122547",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="3.579139411",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="3.937053352",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="4.294967296",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="5.726623061",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="7.158278826",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="8.589934591",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="10.021590356",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="11.453246121",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="12.884901886",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="14.316557651",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="15.748213416",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="17.179869184",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="22.906492245",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="28.633115306",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="30.0",} 11.0
example2_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",le="+Inf",} 11.0
example2_timer_seconds_count{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",} 11.0
example2_timer_seconds_sum{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",} 0.589933559
# HELP example2_counter_total Example counter
# TYPE example2_counter_total counter
example2_counter_total{class="com.example.demo.Examples",exception="none",key1="value1",key2="value2",method="example2",result="success",} 11.0
```

## Example 3

```
# HELP example3_counter_total  
# TYPE example3_counter_total counter
example3_counter_total{class="com.example.demo.Examples",exception="none",method="example3",result="success",} 11.0
# HELP example3_timer_seconds  
# TYPE example3_timer_seconds histogram
example3_timer_seconds{class="com.example.demo.Examples",exception="none",method="example3",quantile="0.5",} 0.0
example3_timer_seconds{class="com.example.demo.Examples",exception="none",method="example3",quantile="0.95",} 0.0
example3_timer_seconds{class="com.example.demo.Examples",exception="none",method="example3",quantile="0.99",} 0.0
example3_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",method="example3",le="0.02",} 5.0
example3_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",method="example3",le="0.04",} 8.0
example3_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",method="example3",le="0.06",} 9.0
example3_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",method="example3",le="0.08",} 9.0
example3_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",method="example3",le="+Inf",} 11.0
example3_timer_seconds_count{class="com.example.demo.Examples",exception="none",method="example3",} 11.0
example3_timer_seconds_sum{class="com.example.demo.Examples",exception="none",method="example3",} 0.398910352
# HELP example3_timer_seconds_max  
# TYPE example3_timer_seconds_max gauge
example3_timer_seconds_max{class="com.example.demo.Examples",exception="none",method="example3",} 0.098644635
```

## Example 4

```
# HELP example4_counter_total  
# TYPE example4_counter_total counter
example4_counter_total{class="com.example.demo.Examples",exception="none",method="example4",result="success",} 11.0
# HELP example4_timer_seconds  
# TYPE example4_timer_seconds histogram
example4_timer_seconds{class="com.example.demo.Examples",exception="none",method="example4",quantile="0.5",} 0.0
example4_timer_seconds{class="com.example.demo.Examples",exception="none",method="example4",quantile="0.9",} 0.0
example4_timer_seconds{class="com.example.demo.Examples",exception="none",method="example4",quantile="0.95",} 0.0
example4_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",method="example4",le="0.04",} 2.0
example4_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",method="example4",le="0.05",} 4.0
example4_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",method="example4",le="0.06",} 6.0
example4_timer_seconds_bucket{class="com.example.demo.Examples",exception="none",method="example4",le="+Inf",} 11.0
example4_timer_seconds_count{class="com.example.demo.Examples",exception="none",method="example4",} 11.0
example4_timer_seconds_sum{class="com.example.demo.Examples",exception="none",method="example4",} 0.707124596
# HELP example4_timer_seconds_max  
# TYPE example4_timer_seconds_max gauge
example4_timer_seconds_max{class="com.example.demo.Examples",exception="none",method="example4",} 0.091537615
```

## Example 5

```
# HELP example5_timer_seconds_max  
# TYPE example5_timer_seconds_max gauge
example5_timer_seconds_max{key1="value1",} 0.092
# HELP example5_timer_seconds  
# TYPE example5_timer_seconds summary
example5_timer_seconds_count{key1="value1",} 11.0
example5_timer_seconds_sum{key1="value1",} 0.495
# HELP example5_counter_total  
# TYPE example5_counter_total counter
example5_counter_total{key1="value1",} 11.0
```

## Example 6

```
# HELP example6_counter_total example6
# TYPE example6_counter_total counter
example6_counter_total{key1="value1",key2="value2",} 11.0
# HELP example6_timer_seconds_max example6
# TYPE example6_timer_seconds_max gauge
example6_timer_seconds_max 1580443.894
# HELP example6_timer_seconds example6
# TYPE example6_timer_seconds histogram
example6_timer_seconds{quantile="0.5",} 0.0
example6_timer_seconds{quantile="0.9",} 0.0
example6_timer_seconds{quantile="0.95",} 0.0
example6_timer_seconds_bucket{le="0.02",} 0.0
example6_timer_seconds_bucket{le="0.04",} 0.0
example6_timer_seconds_bucket{le="0.06",} 0.0
example6_timer_seconds_bucket{le="+Inf",} 8.0
example6_timer_seconds_count 8.0
example6_timer_seconds_sum 6435051.806
```
