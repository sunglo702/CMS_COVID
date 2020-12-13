package com.dmu.covid.controller;

import com.dmu.covid.entity.IndexInfo;
import com.dmu.covid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Author : hadoo
 * @Date : 2020/12/3 16:01
 */
@Controller
public class IndexController {
    @Autowired
    UserService userService;
//,produces="application/json;charset=UTF-8"
    @RequestMapping(value = "/index")
    public String index(Model model){
        //从SecurityContextHolder中得到Authentication对象，进而获取权限列表，传到前端
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Collection<GrantedAuthority> authorityCollection = (Collection<GrantedAuthority>) auth.getAuthorities();
        model.addAttribute("authorities", authorityCollection.toString());
        model.addAttribute("username", SecurityContextHolder.getContext().getAuthentication().getName());

        //查找数量
        int pN = userService.getNums("sick");
        int cN=userService.getNums("cured");
        int dN=userService.getNums("dead");
        int tN=userService.getNums("separated");
        //计算百分比
        double cR=(double)Math.round((new Double(cN)/new Double(pN))*100);
        double dR=(double)Math.round((new Double(dN)/new Double(pN))*100);
        //放入indexInfo中
        IndexInfo indexInfo=new IndexInfo().setCureNumber(cN).
                setCureRate(cR).setSumPatientNumber(pN).setSumTouchNumber(tN).
                setDeadNumber(dN).setDeadRate(dR);

        patientDatas(indexInfo);
        model.addAttribute("indexInfo",indexInfo);
        return "index";
    }

    public void patientDatas(IndexInfo indexInfo){
        List dates=new ArrayList();
        List patientNums=new ArrayList();
        List curetNums=new ArrayList();
        for (int i=4;i>=0;i--){
            Date date= new Date(System.currentTimeMillis()-(i*86400000));
            dates.add(date.getTime());
            patientNums.add(userService.getNums("sick")+1);
            curetNums.add(userService.getNums("cured")+1);
        }
        indexInfo.setDates(dates).setPatientNums(patientNums).setCureNums(curetNums);
    }


}