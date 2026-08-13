package com.tanishq.blogsphere.demo;

import org.springframework.stereotype.Component;

@Component
public class Greeter {
    public String greet() {
        return "Hello from Greeter!";
    }
}