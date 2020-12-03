package com.dmu.covid.mapper;

import com.dmu.covid.entity.Supplies;
import java.util.List;

public interface SuppliesMapper {
    int insert(Supplies record);

    List<Supplies> selectAll();
}