package com.dmu.covid.mapper;

import com.dmu.covid.entity.Transport;
import java.util.List;

public interface TransportMapper {
    int insert(Transport record);

    List<Transport> selectAll();
}