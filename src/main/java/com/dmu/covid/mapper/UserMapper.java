package com.dmu.covid.mapper;

import com.dmu.covid.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserMapper {
    int insert(User record);

    List<User> selectAll();

    User findByUsername(String username);
}