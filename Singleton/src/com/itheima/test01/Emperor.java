package com.itheima.test01;

/**
 * 皇帝的实体类
 *
 * @author TJR
 * @version 1.0, 2017-12-21 18:18
 */
public class Emperor {

    private static Emperor emperor = null;

    private Emperor() {
    }

    public static Emperor getInstance() {
        if (emperor == null) {
            emperor = new Emperor();
        }
        return emperor;
    }

    public static void emperorInfo() {
        System.out.println("简单的皇帝单例模式...");
    }

}
