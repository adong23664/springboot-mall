package com.don.springbootmall.dao;

import com.don.springbootmall.dto.UserRegisterRequest;
import com.don.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);




}
