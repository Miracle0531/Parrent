package com.itheima.humantest02;

/**
 * 男性人种生产工厂
 *
 * @author TJR
 * @version 1.0, 2017-12-21 19:25
 */
public class MaleHumanFactory implements HumanFactory {

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
