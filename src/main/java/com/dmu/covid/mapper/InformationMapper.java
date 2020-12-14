package com.dmu.covid.mapper;

import com.dmu.covid.entity.Information;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface InformationMapper {
    int insert(Information record);

    List<Information> selectAll();
}