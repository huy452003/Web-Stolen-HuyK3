package com.webhuyk3.services;

import com.webhuyk3.entitys.User;

public interface UserService {
    User findByUserName(String userName);
}
