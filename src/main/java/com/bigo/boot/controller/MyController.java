package com.bigo.boot.controller;

/*
@Time    : 2019/3/16 1:20 AM
@Author  : 0c0c0f
@File    : MyController.java
@Software: IntelliJ IDEA
*/

import com.bigo.boot.config.MyConfig;
import com.bigo.boot.config.MyConfigBean;
import com.bigo.boot.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class MyController {
    @Value("${myConfig.myObject.myName}")
    private String myName;

    @Value("${myConfig.myObject.myAge}")
    private int myAge;

    @Autowired
    private MyConfigBean myConfigBean;

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public Object test() {
        Person person = new Person();
        person.setId(3);
        person.setName("Bigo Inc");
        person.setBirthday(new Date());

        System.out.println(myAge);
        System.out.println(myName);

        System.out.println(myConfigBean.getMyAge());
        System.out.println(myConfigBean.getMyName());
        return person;
    }
}
