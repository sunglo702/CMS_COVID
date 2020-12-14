package com.dmu.covid.service.impl;

import com.dmu.covid.entity.Information;
import com.dmu.covid.mapper.InformationMapper;
import com.dmu.covid.mapper.UserMapper;
import com.dmu.covid.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : hadoo
 * @Date : 2020/12/5 18:56
 */
@Service
public class InfoServiceImpl implements InfoService {
    @Autowired
    InformationMapper informationMapper;

    @Override
    public void insert(Information information) {
        informationMapper.insert(information);
    }

    @Override
    public List<Information> selectAll() {
        return informationMapper.selectAll();
    }
}