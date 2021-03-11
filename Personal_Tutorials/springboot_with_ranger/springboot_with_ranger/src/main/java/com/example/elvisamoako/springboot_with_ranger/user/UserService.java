package com.example.elvisamoako.springboot_with_ranger.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserService {
    @Autowired
    private UserDaoService service;


    @GetMapping("/users")
    public List<User> retrieveUsers(){
        return service.findAll();
    }


    @GetMapping("/users/{id}")
    public User retreiveUser(@PathVariable int id){
        return service.findOneUser(id);
    }
}
