package com.itheima.demo01.impl;

import com.itheima.demo01.Man;

/**
 * 武松实现类
 *
 * @author TJR
 * @version 1.0, 2017-12-17 21:13
 */
public class Wusong implements Man {

    @Override
    public void drink() {
        System.out.println("武松喝酒...");
    }

    @Override
    public void beat() {
        System.out.println("武松打人...");
    }
}
