package com.dmu.covid.controller;

/**
 * @Author : hadoo
 * @Date : 2020/12/7 14:58
 */


import com.dmu.covid.entity.Report;
import com.dmu.covid.service.ReportService;
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
@RequestMapping(value = "/report")
public class ReportController {
    @Autowired
    ReportService reportService;

    @RequestMapping("/upload")
    @ResponseBody
    public boolean uploadReport(Report report) throws ParseException {
        //填写当前时间
        Date getDate = Calendar.getInstance().getTime();
        report.setDate(getDate);
        reportService.insert(report);
        return true;
    }
    @RequestMapping("/goupload")
    public String goUpload(){return "reportUpload";}

    @RequestMapping("/list")
    public String showReport(Model model){
        List<Report> reports = reportService.selectAll();
        model.addAttribute("reports",reports);
        return "reportsList";
    }
    @RequestMapping("/manages")
    public String manageReport(Model model){
        List<Report> reportes = reportService.selectAll();
        model.addAttribute("reportes",reportes);
        return "reportManage";
    }
}
