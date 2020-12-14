package com.dmu.covid.entity;

import java.util.Date;

public class Report {
    private Integer id;
    private Integer userId;
    private String userName;
    private String pos;
    private String infor;
    private Date date;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPos() {
        return pos;
    }
    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getInfor() {
        return infor;
    }
    public void setInfor(String infor) {
        this.infor = infor;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
}
