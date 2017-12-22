package com.itheima.test01.test;

import com.itheima.test01.Car;
import com.itheima.test01.impl.FirstCar;
import com.itheima.test01.impl.SecondCar;
import org.junit.Test;

/**
 * 汽车生产的测试类
 *
 * @author TJR
 * @version 1.0, 2017-12-22 9:26
 */
public class CarTest {

    @Test
    public void test01() {
        Car firstCar = new FirstCar();
        firstCar.run();

        Car secondCar = new SecondCar();
        secondCar.run();
    }

}
