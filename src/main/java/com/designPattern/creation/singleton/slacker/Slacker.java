package com.designPattern.creation.singleton.slacker;

/**
 * @author: zhenghailong
 * @date: 2019/9/22 21:51
 * @modified By:
 * @description:
 * 优点：起到懒加载效果
 * 缺点：多线程案例有问题
 * 实际开发中不能使用这种
 */
public class Slacker {

    private Slacker(){

    }

    private static Slacker instance;

    public static Slacker getInstance(){
        if (instance == null){
            instance = new Slacker();
        }
        return instance;
    }
}
