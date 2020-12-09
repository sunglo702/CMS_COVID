package com.dmu.covid.service.impl;

import com.dmu.covid.entity.Access;
import com.dmu.covid.entity.Report;
import com.dmu.covid.mapper.AccessMapper;
import com.dmu.covid.mapper.ReportMapper;
import com.dmu.covid.service.AccessService;
import com.dmu.covid.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    ReportMapper reportMapper;

    @Override
    public void insert(Report report) {
        reportMapper.insert(report);
    }

    @Override
    public List<Report> selectAll() {
        return reportMapper.selectAll();
    }
}
