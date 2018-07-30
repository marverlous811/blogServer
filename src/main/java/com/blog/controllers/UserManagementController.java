package com.blog.controllers;

import com.blog.models.User;
import com.blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;


/**
 * Created by minht on 6/22/2018.
 */


@RestController
@RequestMapping(path="/user")

@EnableResourceServer
public class UserManagementController {

    @Autowired
    UserService uS;
    @PostMapping(path="/register")
    public ResponseEntity<User> addNewUser (@RequestBody User user) {

        uS.register(user);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @GetMapping(path="/test")
    public ResponseEntity<String> test(){

        return new ResponseEntity<String>("good job", HttpStatus.OK);
    }


}
