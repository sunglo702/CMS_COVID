package com.dmu.covid.mapper;

import com.dmu.covid.entity.Access;
import com.dmu.covid.entity.Report;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReportMapper {
    int insert(Report record);

    List<Report> selectAll();
}
