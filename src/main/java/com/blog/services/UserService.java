package com.blog.services;


import com.blog.dao.UserRepository;
import com.blog.models.User;
import com.blog.webSupport.exceptionHandlers.DataExistsException;
import org.apache.juli.logging.Log;
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

        if (userRepository.findUserByUsername(user.getUsername()).size()>0)
            throw new DataExistsException("username",user.getUsername());
        userRepository.save(user);

        return "registered";
    }
}
