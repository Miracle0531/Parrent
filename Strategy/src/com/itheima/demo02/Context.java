package com.itheima.demo02;

/**
 * 计算器策略
 *
 * @author TJR
 * @version 1.0, 2017-12-17 20:30
 */
public class Context {

    private Count count;

    public Context(Count count){
        this.count = count;
    }

    public void operate(){
        this.count.count();
    }

}
