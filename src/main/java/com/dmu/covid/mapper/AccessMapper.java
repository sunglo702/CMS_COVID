package com.dmu.covid.mapper;

import com.dmu.covid.entity.Access;
import java.util.List;

public interface AccessMapper {
    int insert(Access record);

    List<Access> selectAll();
}