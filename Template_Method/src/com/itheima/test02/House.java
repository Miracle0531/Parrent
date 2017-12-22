package com.itheima.test02;

/**
 * 建造房子的抽象类
 *
 * @author TJR
 * @version 1.0, 2017-12-22 9:37
 */
public abstract class House {

    protected abstract void base();

    protected abstract void light();

    protected abstract void water();

    public void furniture() {

        this.base();
        this.water();
        this.light();

    }
}
