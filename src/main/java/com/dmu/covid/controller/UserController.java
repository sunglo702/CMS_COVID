package com.dmu.covid.controller;

import com.dmu.covid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author : hadoo
 * @Date : 2020/12/3 18:05
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;


}