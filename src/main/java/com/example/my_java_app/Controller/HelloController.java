package com.example.my_java_app.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController; 

@RestController
public class HelloController {

     @GetMapping("/")
    public String home() {
        return "Hello from DevOps Java App!";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
