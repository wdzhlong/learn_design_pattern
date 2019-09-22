package com.designPattern.creation.singleton.slacker;

/**
 * @author: zhenghailong
 * @date: 2019/9/22 21:51
 * @modified By:
 * @description:
 * 优点：起到懒加载效果
 * 缺点：效率变低
 */
public class SynchronizedSlacker {

    private SynchronizedSlacker(){

    }

    private static SynchronizedSlacker instance;

    public static synchronized SynchronizedSlacker getInstance(){
        if (instance == null){
            instance = new SynchronizedSlacker();
        }
        return instance;
    }
}
