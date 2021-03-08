package com.example.elvisamoako.springboot_with_ranger.helloworld;


import org.springframework.web.bind.annotation.*;

@RestController //
public class HelloWorldController {
//    To use this,we need:
//    method
//    URI - /helloWorld
//    get request


//    @RequestMapping("/hello-world") //OR
    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World!";
    }
    
    @GetMapping("/hello-world-bean")
    public HelloWorldBean HelloWorldBean(){
        return new HelloWorldBean("Hey Bean!"); 
    }


//    Adding a path variable
    @GetMapping("/hello-world-bean/path-variable/{name}")
    public HelloWorldBean HelloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello, %s", name));
    }
}
