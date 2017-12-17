package com.itheima.demo01.impl;

import com.itheima.demo01.Strategy;

/**
 * 第一种方案实现类
 *
 * @author TJR
 * @version 1.0, 2017-12-17 20:13
 */
public class FistImpl implements Strategy {

    @Override
    public void operate() {
        System.out.println("实现方案一...");
    }

}
