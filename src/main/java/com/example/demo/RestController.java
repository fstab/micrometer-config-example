package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private final Examples examples;

    public RestController(Examples examples) {
        this.examples = examples;
    }

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String sayHello() throws InterruptedException {
        examples.example1();
        examples.example2();
        examples.example3();
        examples.example4();
        examples.example5();
        examples.example6();
        return "<html><body><h1>Hello, World!</h1>\n" +
                "Metrics are on <a href=\"http://localhost:8080/actuator/prometheus\">http://localhost:8080/actuator/prometheus</a>\n" +
                "</body></html>\n";
    }
}
