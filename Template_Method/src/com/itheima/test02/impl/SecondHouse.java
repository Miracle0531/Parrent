package com.itheima.test02.impl;

import com.itheima.test02.House;

/**
 * 第二座房子
 *
 * @author TJR
 * @version 1.0, 2017-12-22 9:41
 */
public class SecondHouse extends House {

    @Override
    protected void base() {
        System.out.println("第二座房子打地基...");
    }

    @Override
    protected void light() {
        System.out.println("第二座房子通电...");
    }

    @Override
    protected void water() {
        System.out.println("第二座房子给水...");
    }

}
