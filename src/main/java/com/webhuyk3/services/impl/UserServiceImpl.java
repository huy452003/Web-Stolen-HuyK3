package com.webhuyk3.services.impl;

import com.webhuyk3.models.User;
import com.webhuyk3.repositorys.UserRepository;
import com.webhuyk3.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }
}
