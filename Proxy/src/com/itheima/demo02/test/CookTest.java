package com.itheima.demo02.test;

import com.itheima.demo02.Cook;
import com.itheima.demo02.impl.DadCook;
import com.itheima.demo02.impl.MomCook;

/**
 * 做饭的测试类
 *
 * @author TJR
 * @version 1.0, 2017-12-17 21:23
 */
public class CookTest {

    public static void main(String[] args) {

        MomCook momCook = new MomCook();
        momCook.cookie();
        momCook.eat();

        MomCook momCook1 = new MomCook(new DadCook());
        momCook1.cookie();
        momCook1.eat();

    }

}
