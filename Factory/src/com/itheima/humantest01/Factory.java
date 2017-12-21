package com.itheima.humantest01;

/**
 * 人种生产工厂
 *
 * @author TJR
 * @version 1.0, 2017-12-21 18:52
 */
public interface Factory {
    public abstract <T extends  Human> T createHuman(Class<T> clazz);
}
