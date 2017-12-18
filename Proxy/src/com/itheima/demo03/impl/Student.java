package com.itheima.demo03.impl;

import com.itheima.demo03.Study;

/**
 * 学生的学习实现类
 *
 * @author TJR
 * @version 1.0, 2017-12-18 9:56
 */
public class Student implements Study {

    @Override
    public void listen() {
        System.out.println("学生听课...");
    }

    @Override
    public void homeWork() {
        System.out.println("学生写作业...");
    }
}
