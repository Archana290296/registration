package com.registration.controller;

import com.registration.model.UserRegistration;
import com.registration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registration")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/")
    public UserRegistration createUser(@RequestBody UserRegistration user){
        return  this.service.createUser(user);
    }

    @GetMapping("/{username}")
    public UserRegistration getUser(@PathVariable("username") String username){
        return this.service.getUser(username);
    }

    @GetMapping("/")
    public List<UserRegistration> getAllUsers(){
        return  this.service.getAllUsers();
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Integer userId){
        this.service.deleteUser(userId);
    }
}
