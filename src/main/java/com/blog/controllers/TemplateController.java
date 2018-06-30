package com.blog.controllers;

import com.blog.models.User;
import com.blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by minht on 6/22/2018.
 */

@RestController
@RequestMapping(path="/user")
public class TemplateController {

    @Autowired
    UserService uS;


    @PostMapping(path="/register")
    public ResponseEntity<User> addNewUser (@RequestBody User user) {

        uS.register(user);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }


}
