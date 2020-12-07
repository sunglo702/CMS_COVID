package com.dmu.covid.service;

import com.dmu.covid.entity.User;

import java.util.List;

/**
 * @Author : hadoo
 * @Date : 2020/12/3 17:44
 */
public interface UserService {
    //根据账号查找用户
    public User findByUsername(String username);

    public User findByUserId(Integer userId);

    //添加用户
    public void addUser(User user);

    //查找所有用户
    public List<User> findAll();

    void changeState(Integer id,String state);

    int getNums(String state);

}