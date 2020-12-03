package com.dmu.covid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author : hadoo
 * @Date : 2020/12/3 16:01
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String view(){
        return "login";
    }

}