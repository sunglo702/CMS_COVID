package com.dmu.covid.controller;

import com.dmu.covid.entity.Information;
import com.dmu.covid.service.InfoService;
import com.dmu.covid.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Author : hadoo
 * @Date : 2020/12/5 18:50
 */
@Controller
@RequestMapping("info")
@Slf4j
public class InfoController {
    @Autowired
    InfoService infoService;

    @Autowired
    UserService userService;

    @PostMapping("/upload")
    @ResponseBody
    public boolean uploadInfo(Information information) throws ParseException {
        //填写当前时间
        Date getDate = Calendar.getInstance().getTime();
        information.setDate(getDate);
        infoService.insert(information);
        return true;
    }

    @RequestMapping("/goupload")
    public String goUpload(){
        return "infoUpload";
    }

    @RequestMapping("/list")
    public String showInfos(Model model){
        List<Information> infos = infoService.selectAll();
        for(Information info : infos){
            info.setUser(userService.findByUserId(info.getUserId()));
        }
        model.addAttribute("infos",infos);
        return "infoList";
    }
}