package com.dmu.covid.service;

import com.dmu.covid.entity.Report;

import java.util.List;

public interface ReportService {
    void insert(Report report);

    List<Report> selectAll();
}
