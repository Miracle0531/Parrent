package com.itheima.humantest02;

import org.junit.Test;

/**
 * 抽象工厂人种测试类
 *
 * @author TJR
 * @version 1.0, 2017-12-21 19:26
 */
public class HumanTest {

    @Test
    public void test() {

        MaleHumanFactory maleHumanFactory = new MaleHumanFactory();
        Human maleYellowHuman = maleHumanFactory.createHuman(MaleYellowHuman.class);
        maleYellowHuman.eat();
        maleYellowHuman.talk();
        maleYellowHuman.sex();

        Human femaleYellowHuman = maleHumanFactory.createHuman(FemaleYellowHuman.class);
        femaleYellowHuman.eat();
        femaleYellowHuman.talk();
        femaleYellowHuman.sex();

    }

}
