package com.dmu.covid.controller;

/**
 * @Author : hadoo
 * @Date : 2020/12/7 14:58
 */

import com.dmu.covid.entity.Access;
import com.dmu.covid.service.AccessService;
import com.dmu.covid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/access")
public class AccessController {
    @Autowired
    AccessService accessService;

    @Autowired
    UserService userService;

    @RequestMapping("/list")
    public String showAccess(Model model){
        List<Access> accesses = accessService.selectAll();
        model.addAttribute("accesses",accesses);
        return "accessList";
    }
}
