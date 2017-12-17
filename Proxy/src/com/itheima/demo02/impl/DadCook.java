package com.itheima.demo02.impl;

import com.itheima.demo02.Cook;

/**
 * 爸爸做饭
 *
 * @author TJR
 * @version 1.0, 2017-12-17 21:19
 */
public class DadCook implements Cook {

    @Override
    public void cookie() {
        System.out.println("爸爸做饭...");
    }

    @Override
    public void eat() {
        System.out.println("爸爸吃饭...");
    }
}
