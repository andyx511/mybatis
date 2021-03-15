package com.alex.ni.mybatis.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author AlexNi
 * @since 2021-01-18 19:43:53
 */
public class User implements Serializable {
    private static final long serialVersionUID = -56657260495492825L;
    
    private Long id;
    
    private String account;
    
    private String name;
    
    private String password;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}