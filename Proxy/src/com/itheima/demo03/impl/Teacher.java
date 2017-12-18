package com.itheima.demo03.impl;

import com.itheima.demo03.Study;

/**
 * 老师的学习实现类
 *
 * @author TJR
 * @version 1.0, 2017-12-18 9:57
 */
public class Teacher implements Study {

    private Study study;

    public Teacher() {
        this.study = new Student();
    }

    public Teacher(Study study) {
        this.study = study;
    }

    @Override
    public void listen() {
        this.study.listen();
    }

    @Override
    public void homeWork() {
        this.study.homeWork();
    }
}
