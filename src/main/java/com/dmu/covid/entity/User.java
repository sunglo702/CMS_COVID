package com.dmu.covid.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.Date;

@NoArgsConstructor
@Data
@Accessors(chain=true)
public class User {

    private Integer id;

    private String address;
    private String name;

    private Date regtime;

    private String username;
    private String password;

    private String phone;

    private String ident;

    private String role;

    private String state;

}