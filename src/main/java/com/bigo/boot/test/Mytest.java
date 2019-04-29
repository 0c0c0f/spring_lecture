package com.bigo.boot.test;

/*
@Time    : 2019/3/16 11:07 PM
@Author  : 0c0c0f
@File    : Mytest.java
@Software: IntelliJ IDEA
*/

import java.lang.reflect.Method;

public class Mytest {
    public static void main(String[] args) throws Exception {
        Class<?> cLazz = MyTest2.class;
        Method method = cLazz.getDeclaredMethod("main", String[].class);
        method.invoke(null, new Object[]{null});
    }
}
