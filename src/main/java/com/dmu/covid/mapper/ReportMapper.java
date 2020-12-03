package com.dmu.covid.mapper;

import com.dmu.covid.entity.Report;
import java.util.List;

public interface ReportMapper {
    int insert(Report record);

    List<Report> selectAll();
}