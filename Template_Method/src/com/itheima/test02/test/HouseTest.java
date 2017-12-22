package com.itheima.test02.test;

import com.itheima.test02.House;
import com.itheima.test02.impl.FirstHouse;
import com.itheima.test02.impl.SecondHouse;
import org.junit.Test;

/**
 * 房子建造的测试类
 *
 * @author TJR
 * @version 1.0, 2017-12-22 9:42
 */
public class HouseTest {

    @Test
    public void test() {

        House firstHouse = new FirstHouse();
        firstHouse.furniture();

        House secondHouse = new SecondHouse();
        secondHouse.furniture();

    }

}
