package com.designPattern.creation.singleton.staticInner;

/**
 * @author: zhenghailong
 * @date: 2019/9/22 22:04
 * @modified By:
 * @description:
 */
public class StaticInner {

    private StaticInner(){}

    private static class SingletonInstance{
        private static final StaticInner INSTANCE = new StaticInner();
    }

    public static StaticInner getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
