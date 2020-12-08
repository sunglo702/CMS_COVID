package com.dmu.covid.service;

/**
 * @Author : hadoo
 * @Date : 2020/12/7 15:08
 */

import com.dmu.covid.entity.Access;
import com.dmu.covid.entity.Information;

import java.util.List;


public interface AccessService {

    //添加一个出入审批检查
    void insert(Access access);

    List<Access> selectAll();
}
