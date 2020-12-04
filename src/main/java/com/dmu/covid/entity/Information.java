package com.dmu.covid.entity;

import java.util.Date;

public class Information {
    private Integer id;

    private Integer userId;

    private String content;

    private Date date;

    private Boolean virus;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getVirus() {
        return virus;
    }

    public void setVirus(Boolean virus) {
        this.virus = virus;
    }
}