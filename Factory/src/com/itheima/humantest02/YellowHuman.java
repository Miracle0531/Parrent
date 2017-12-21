package com.itheima.humantest02;

/**
 * 黄种人的实现类
 *
 * @author TJR
 * @version 1.0, 2017-12-21 19:20
 */
public abstract class YellowHuman implements Human {

    @Override
    public void eat(){
        System.out.println("黄种人吃饭...");
    }

    @Override
    public void talk(){
        System.out.println("黄种人说话...");
    }

}
