package com.tanishq.blogsphere.demo;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private final Greeter greeter;

    public GreetingService(Greeter greeter) {
        this.greeter = greeter;
    }

    public String getMessage() {
        return greeter.greet();
    }
}