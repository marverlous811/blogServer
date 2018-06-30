package com.blog.dao;

import com.blog.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by minht on 6/30/2018.
 */

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
        List<User> findUserByUsername(String username);


}
