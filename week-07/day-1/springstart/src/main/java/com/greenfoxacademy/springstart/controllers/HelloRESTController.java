package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
//    private static final String template = "Hello, %s!";

    private final AtomicLong counter = new AtomicLong();


    @RequestMapping("/greeting")
    public Greeting greeting( @RequestParam (value = "name", defaultValue = "Your name") String name){
        return new Greeting(counter.incrementAndGet(),name);
    }
}
