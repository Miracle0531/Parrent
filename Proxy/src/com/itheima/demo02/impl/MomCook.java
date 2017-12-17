package com.itheima.demo02.impl;

import com.itheima.demo02.Cook;

/**
 * 妈妈做饭
 *
 * @author TJR
 * @version 1.0, 2017-12-17 21:21
 */
public class MomCook implements Cook {

    private Cook cook;

    public MomCook() {
        this.cook = new DadCook();
    }

    public MomCook(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void cookie() {
        this.cook.cookie();
    }

    @Override
    public void eat() {
        this.cook.eat();
    }
}
