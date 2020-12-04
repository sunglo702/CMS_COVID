package com.dmu.covid.mapper;

import com.dmu.covid.entity.Role;
import java.util.List;

public interface RoleMapper {
    int insert(Role record);

    List<Role> selectAll();
}