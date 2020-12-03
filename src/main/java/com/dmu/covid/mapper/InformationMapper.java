package com.dmu.covid.mapper;

import com.dmu.covid.entity.Information;
import java.util.List;

public interface InformationMapper {
    int insert(Information record);

    List<Information> selectAll();
}