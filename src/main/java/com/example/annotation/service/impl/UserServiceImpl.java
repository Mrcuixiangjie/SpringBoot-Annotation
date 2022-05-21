package com.example.annotation.service.impl;

import com.example.annotation.pojo.User;
import com.example.annotation.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(int id){
        return new User(id,"崔祥杰",26,true);
    }
}
