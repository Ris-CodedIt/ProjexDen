package com.ris.projexdenserver.controller;

import com.ris.projexdenserver.domain.User;
import com.ris.projexdenserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;
    @PostMapping("/register")
    public User register(@RequestBody User user){
        return service.register(user);
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return service.getAllUsers();
    }


    @GetMapping("/users/{id}")
    public User getUser(@PathVariable(name = "id") Long id){
        return service.getUser(id);
    }


}
