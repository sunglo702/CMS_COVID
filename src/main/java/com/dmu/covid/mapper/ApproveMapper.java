package com.dmu.covid.mapper;

import com.dmu.covid.entity.Approve;
import java.util.List;

public interface ApproveMapper {
    int insert(Approve record);

    List<Approve> selectAll();
}