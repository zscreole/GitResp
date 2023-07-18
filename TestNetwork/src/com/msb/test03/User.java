package com.msb.test03;

import java.io.Serializable;

/**
 * @author: Adam
 * @date: 2023/7/13 - 11:48
 * @description: com.msb.test03
 * @version: 1.0
 */
public class User implements Serializable {
    private static final long serialVersionUID = 9050691344308365540L;
    private String name;
    private String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }
}
