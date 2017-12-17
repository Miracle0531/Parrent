package com.itheima.demo01;

/**
 * 策略接口容器
 *
 * @author TJR
 * @version 1.0, 2017-12-17 20:15
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void getOperate() {
        this.strategy.operate();
    }

}
