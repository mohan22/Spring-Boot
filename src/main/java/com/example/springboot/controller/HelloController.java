package com.example.springboot.controller;

import jakarta.annotation.PreDestroy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";

    }

    @PreDestroy
    public void bye(){
        System.out.println("bye bye!!!!!");
    }

}