package com.itheima.test01.impl;

import com.itheima.test01.Car;

/**
 * 第二辆车
 *
 * @author TJR
 * @version 1.0, 2017-12-22 9:25
 */
public class SecondCar extends Car {

    @Override
    protected void start() {
        System.out.println("第二辆车启动了...");
    }

    @Override
    protected void stop() {
        System.out.println("第二辆车停止了...");
    }

    @Override
    protected void voice() {
        System.out.println("第二辆车鸣笛了...");
    }
}
