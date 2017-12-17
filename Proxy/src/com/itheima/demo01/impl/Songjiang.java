package com.itheima.demo01.impl;

import com.itheima.demo01.Man;

/**
 * 宋江实现类
 *
 * @author TJR
 * @version 1.0, 2017-12-17 21:14
 */
public class Songjiang implements Man {

    private Man man;

    public Songjiang(){
        this.man = new Wusong();
    }

    public Songjiang (Man man){
        this.man = man;
    }

    @Override
    public void drink() {
        this.man.drink();
    }

    @Override
    public void beat() {
        this.man.beat();
    }
}
