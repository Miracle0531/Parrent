package com.itheima.demo01.test;

import com.itheima.demo01.impl.Songjiang;
import com.itheima.demo01.impl.Wusong;

/**
 * 测试类
 *
 * @author TJR
 * @version 1.0, 2017-12-17 21:17
 */
public class ManTest {

    public static void main(String[] args) {

        Songjiang songjiang = null;

        songjiang = new Songjiang(new Wusong());
        songjiang.drink();
        songjiang.beat();

    }

}
