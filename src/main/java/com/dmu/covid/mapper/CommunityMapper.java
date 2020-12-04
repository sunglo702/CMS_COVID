package com.dmu.covid.mapper;

import com.dmu.covid.entity.Community;
import java.util.List;

public interface CommunityMapper {
    int insert(Community record);

    List<Community> selectAll();
}