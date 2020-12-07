package com.dmu.covid.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

/**
 * @Author : hadoo
 * @Date : 2020/12/4 21:21
 */
@Controller
public class HomeController {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}