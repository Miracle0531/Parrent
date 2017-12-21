package com.itheima.humantest02;

/**
 * 女性人种生产工厂实现类
 *
 * @author TJR
 * @version 1.0, 2017-12-21 19:40
 */
public class FemaleHumanFactory implements HumanFactory {

    @Override
    public Human createHuman(Class clazz) {
        Human human = null;
        try {
            human = (Human) Class.forName(clazz.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }

        return human;
    }
}
