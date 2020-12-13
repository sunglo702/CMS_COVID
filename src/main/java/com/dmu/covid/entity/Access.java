package com.dmu.covid.entity;

import java.util.Date;

public class Access {
    private Integer id;
    private Integer userId;
    private String userName;
    private String type;
    private Date date;
    private String fromWhere;
    private String toWhere;
    private String state;

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

    public String getUserName(){return userName;}
    public void setUserName(String userName){this.userName = userName;}

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public String getFromWhere() {
        return fromWhere;
    }
    public void setFromWhere(String fromWhere) {
        this.fromWhere = fromWhere;
    }

    public String getToWhere() { return toWhere; }
    public void setToWhere(String toWhere) {
        this.toWhere = toWhere;
    }

    public String getState(){return state;}
    public void setState(String state){this.state = state;}
}
