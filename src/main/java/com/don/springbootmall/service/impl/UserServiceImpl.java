package com.don.springbootmall.service.impl;


import com.don.springbootmall.dao.UserDao;
import com.don.springbootmall.dto.UserRegisterRequest;
import com.don.springbootmall.model.User;
import com.don.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
