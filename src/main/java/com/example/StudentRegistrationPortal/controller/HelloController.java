package com.example.StudentRegistrationPortal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld(){

        return "HELLO WORLD";
    }


    @GetMapping("/welcome")
    public String welcomePage(){

        return "WELCOME TO HORTECHNET";
    }

}
