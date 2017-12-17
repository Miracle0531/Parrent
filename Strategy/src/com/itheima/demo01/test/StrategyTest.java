package com.itheima.demo01.test;

import com.itheima.demo01.Context;
import com.itheima.demo01.impl.FistImpl;
import com.itheima.demo01.impl.SecondImpl;
import com.itheima.demo01.impl.ThirdImpl;

/**
 * 策略模式测试类
 *
 * @author TJR
 * @version 1.0, 2017-12-17 20:17
 */
public class StrategyTest {

    public static void main(String[] args) {

        Context context = null;

        context = new Context(new FistImpl());
        context.getOperate();

        System.out.println("----------");

        context = new Context(new SecondImpl());
        context.getOperate();

        System.out.println("----------");

        context = new Context(new ThirdImpl());
        context.getOperate();

    }

}
