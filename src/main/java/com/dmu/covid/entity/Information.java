package com.dmu.covid.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Information {
    private Integer id;

    private Integer userId;

    private String content;

    private Date date;

    private Boolean virus;

    private User user;


}