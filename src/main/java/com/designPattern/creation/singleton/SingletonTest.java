package com.designPattern.creation.singleton;

import com.designPattern.creation.singleton.hungryMan.HungryManSingleton;

/**
 * @author: zhenghailong
 * @date: 2019/9/22 21:45
 * @modified By:
 * @description:
 */
public class SingletonTest {

    public static void main(String[] args) {
        HungryManSingleton instance1 = HungryManSingleton.getInstance();
        HungryManSingleton instance2 = HungryManSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}
