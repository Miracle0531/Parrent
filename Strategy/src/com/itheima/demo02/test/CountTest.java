package com.itheima.demo02.test;

import com.itheima.demo02.Context;
import com.itheima.demo02.impl.AddCount;
import com.itheima.demo02.impl.DivCount;
import com.itheima.demo02.impl.MulCount;
import com.itheima.demo02.impl.SubCount;

/**
 * 计算器测试
 *
 * @author TJR
 * @version 1.0, 2017-12-17 20:33
 */
public class CountTest {

    public static void main(String[] args) {

        Context context = null;

        context = new Context(new AddCount());
        context.operate();

        context = new Context(new SubCount());
        context.operate();

        context = new Context(new DivCount());
        context.operate();

        context = new Context(new MulCount());
        context.operate();

    }

}
