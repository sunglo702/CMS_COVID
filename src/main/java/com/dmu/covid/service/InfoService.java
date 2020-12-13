package com.dmu.covid.service;

import com.dmu.covid.entity.Information;

import java.util.List;

/**
 * @Author : hadoo
 * @Date : 2020/12/5 18:50
 */
public interface InfoService {
    void insert(Information information);

    List<Information> selectAll();
}