package com.dmu.covid.mapper;

import com.dmu.covid.entity.Access;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AccessMapper {
    int insert(Access record);

    List<Access> selectAll();
}