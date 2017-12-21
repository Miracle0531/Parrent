package com.itheima.humantest01.impl;

import com.itheima.humantest01.Factory;
import com.itheima.humantest01.Human;

import javax.sound.midi.Soundbank;

/**
 * 人种生产工厂的实现类
 *
 * @author TJR
 * @version 1.0, 2017-12-21 18:54
 */
public class HumanFactory implements Factory {

    @Override
    public <T extends Human> T createHuman(Class<T> clazz) {
        // 定义一个人种
        Human human = null;
        try {
            // 使用反射机制生产人种实例
            human = (Human) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误...");
        }

        return (T) human;
    }
}
