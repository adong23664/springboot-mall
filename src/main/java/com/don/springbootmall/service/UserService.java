package com.don.springbootmall.service;

import com.don.springbootmall.dto.UserRegisterRequest;
import com.don.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);


}
