package com.itheima.test01.impl;

import com.itheima.test01.Car;

/**
 * 第一辆车模型
 *
 * @author TJR
 * @version 1.0, 2017-12-22 9:24
 */
public class FirstCar extends Car {

    @Override
    protected void start() {
        System.out.println("第一辆车启动了...");
    }

    @Override
    protected void stop() {
        System.out.println("第一辆车停下了...");
    }

    @Override
    protected void voice() {
        System.out.println("第一辆车鸣笛了...");
    }
}
