package com.bigo.boot.domain;

/*
@Time    : 2019/3/16 1:19 AM
@Author  : 0c0c0f
@File    : Person.java
@Software: IntelliJ IDEA
*/

import java.util.Date;

public class Person {
    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    private Date birthday;
}
