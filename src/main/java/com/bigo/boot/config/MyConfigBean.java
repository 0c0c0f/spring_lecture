package com.bigo.boot.config;

/*
@Time    : 2019/3/16 1:40 AM
@Author  : 0c0c0f
@File    : MyConfigBean.java
@Software: IntelliJ IDEA
*/

import org.springframework.beans.factory.annotation.Value;

public class MyConfigBean {
    @Value("${myConfig.myObject.myName}")
    private String myName;
    @Value("${myConfig.myObject.myAge}")
    private String myAge;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getMyAge() {
        return myAge;
    }

    public void setMyAge(String myAge) {
        this.myAge = myAge;
    }
}
