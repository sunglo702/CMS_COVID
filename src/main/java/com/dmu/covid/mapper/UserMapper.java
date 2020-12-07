package com.dmu.covid.mapper;

import com.dmu.covid.entity.Information;
import com.dmu.covid.entity.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface UserMapper {
    int insert(User record);

    List<User> selectAll();

    User findByUsername(String username);

    User findByUserId(Integer userId);

    void changeState(Integer id,String state);
}