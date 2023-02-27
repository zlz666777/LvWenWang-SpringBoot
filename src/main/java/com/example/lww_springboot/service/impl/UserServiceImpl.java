package com.example.lww_springboot.service.impl;

import com.example.lww_springboot.entiy.User;
import com.example.lww_springboot.mapper.UserMapper;
import com.example.lww_springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;//注入UserMapper

    @Override
    public User login(User user) {
        return userMapper.login(user);//调用mapper层代码
    }

    @Override
    public int update(User user) {
        //调用mapper修改用户信息
        return userMapper.update(user);
    }
}
