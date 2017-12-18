package com.itheima.demo03.test;

import com.itheima.demo03.Study;
import com.itheima.demo03.impl.Student;
import com.itheima.demo03.impl.Teacher;

/**
 * 学习的测试类
 *
 * @author TJR
 * @version 1.0, 2017-12-18 9:58
 */
public class StudyTest {

    public static void main(String[] args) {

        Study study = null;

        study = new Teacher(new Student());
        study.listen();
        study.homeWork();

    }

}
