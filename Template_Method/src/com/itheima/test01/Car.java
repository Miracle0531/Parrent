package com.itheima.test01;

/**
 * 汽车的抽象类
 *
 * @author TJR
 * @version 1.0, 2017-12-22 9:21
 */
public abstract class Car {

    protected abstract void start();

    protected abstract void stop();

    protected abstract void voice();

    public void run() {
        this.start();
        this.voice();
        this.stop();
    }

}
