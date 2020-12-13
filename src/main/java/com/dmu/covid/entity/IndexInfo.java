package com.dmu.covid.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @Author : hadoo
 * @Date : 2020/12/7 13:15
 */
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class IndexInfo {
    private int sumPatientNumber;
    private int deadNumber;
    private double deadRate;
    private int cureNumber;
    private double cureRate;
    private int sumTouchNumber;
    private List dates;
    private List patientNums;
    private List cureNums;
    private String username;

}