package com.blog.services;


import com.blog.dao.UserRepository;
import com.blog.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by minht on 6/22/2018.
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String register(User user){

        userRepository.save(user);
        return "registered";
    }
}
