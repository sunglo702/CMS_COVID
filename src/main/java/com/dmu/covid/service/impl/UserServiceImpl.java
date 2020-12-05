package com.dmu.covid.service.impl;

import com.dmu.covid.entity.User;
import com.dmu.covid.mapper.UserMapper;
import com.dmu.covid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : hadoo
 * @Date : 2020/12/3 17:45
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public List<User> findAll(int page, int size) {
        return userMapper.selectAll();
    }

}