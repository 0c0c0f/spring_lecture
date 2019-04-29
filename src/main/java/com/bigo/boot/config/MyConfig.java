package com.bigo.boot.config;

/*
@Time    : 2019/3/16 1:42 AM
@Author  : 0c0c0f
@File    : MyConfig.java
@Software: IntelliJ IDEA
*/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public MyConfigBean myConfigBean() {
        return new MyConfigBean();
    }
}
