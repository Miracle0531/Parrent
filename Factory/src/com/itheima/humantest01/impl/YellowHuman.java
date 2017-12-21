package com.itheima.humantest01.impl;

import com.itheima.humantest01.Human;

/**
 * 黄种人实现类
 *
 * @author TJR
 * @version 1.0, 2017-12-21 18:50
 */
public class YellowHuman implements Human {

    @Override
    public void eat() {
        System.out.println("黄种人吃饭...");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话...");
    }
}
