package com.zalego.io.demo.controller;


import com.zalego.io.demo.configs.Reset;
import com.zalego.io.demo.entities.Users;
import com.zalego.io.demo.services.Userservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    private Userservices services;
    @PostMapping(value = "/addUser",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public Users insertUser(Users users){
        return services.inseertUser(users);
    }
    @GetMapping
    public List<Users> fetchAll(){
        return services.findAllUsers();
    }

    @PostMapping(value="/authorize",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Users users(Users users){
        return services.authorizeUser(users);
    }
    @PostMapping(value ="/resetPassword",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public Users reset(Reset users){
        System.out.println("controller :"+users.getPassword());
        return services.resetUser(users);

    }
}
