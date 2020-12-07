package com.dmu.covid.service.impl;

/**
 * @Author : hadoo
 * @Date : 2020/12/7 15:08
 */

import com.dmu.covid.entity.Access;
import com.dmu.covid.mapper.AccessMapper;
import com.dmu.covid.service.AccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessServiceImpl implements AccessService {
    @Autowired
    AccessMapper accessMapper;

    @Override
    public void addAccess(Access access) {
        accessMapper.insert(access);
    }

    @Override
    public List<Access> selectAll() {
        return accessMapper.selectAll();
    }
}
