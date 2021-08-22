package com.hellofresh.com.hellofreshdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellofreshController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "helloWorld";
    }
}
