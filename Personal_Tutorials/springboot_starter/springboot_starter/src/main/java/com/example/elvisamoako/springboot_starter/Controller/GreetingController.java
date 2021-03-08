package com.example.elvisamoako.springboot_starter.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/")
    public String getGreeting(){
        return "Hi, Its Elvis...trying out spring for the first time";
    }
}
