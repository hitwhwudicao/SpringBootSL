package com.jingjinspringboot.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCwd {
    @GetMapping
    public String sayHello()
    {
        return  "this is my first Spring Boot program!";
    }
}
