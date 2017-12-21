package com.itheima.humantest01.impl;

import com.itheima.humantest01.Human;

/**
 * 黑种人实现类
 *
 * @author TJR
 * @version 1.0, 2017-12-21 18:51
 */
public class BlackHuman implements Human {

    @Override
    public void eat() {
        System.out.println("黑种人吃饭...");
    }

    @Override
    public void talk() {
        System.out.println("黑种人说话...");
    }
}
