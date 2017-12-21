package com.itheima.humantest01.test;

import com.itheima.humantest01.Human;
import com.itheima.humantest01.impl.BlackHuman;
import com.itheima.humantest01.impl.HumanFactory;
import com.itheima.humantest01.impl.Whitehuman;
import com.itheima.humantest01.impl.YellowHuman;
import org.junit.Test;

/**
 * 人种测试类
 *
 * @author TJR
 * @version 1.0, 2017-12-21 18:57
 */
public class HumanTest {

    @Test
    public void test01() {
        HumanFactory humanFactory = new HumanFactory();
        Human human1 = humanFactory.createHuman(YellowHuman.class);
        human1.eat();
        human1.talk();
    }

    @Test
    public void test02() {
        HumanFactory humanFactory = new HumanFactory();
        Human human = humanFactory.createHuman(Whitehuman.class);
        human.eat();
        human.talk();
    }

    @Test
    public void test03() {
        HumanFactory humanFactory = new HumanFactory();
        Human human = humanFactory.createHuman(BlackHuman.class);
        human.eat();
        human.talk();
    }

}
