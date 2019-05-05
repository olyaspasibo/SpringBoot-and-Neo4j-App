package com.techprimers.springbootneo4jexample1.service;

import com.techprimers.springbootneo4jexample1.model.User;
import com.techprimers.springbootneo4jexample1.repositry.UserRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {
    @Autowired
    UserRepositry userRepositry;
    public Collection<User> getAll() {
        return userRepositry.getAllUsers();
    }
}
