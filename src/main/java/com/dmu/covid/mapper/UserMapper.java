package com.dmu.covid.mapper;

import com.dmu.covid.entity.User;
import java.util.List;

public interface UserMapper {
    int insert(User record);

    List<User> selectAll();
}