package com.designPattern.creation.singleton.duplicationCheck;

/**
 * @author: zhenghailong
 * @date: 2019/9/22 21:58
 * @modified By:
 * @description:
 * 线程安全，延迟加载，效率较高
 * 实际开发中推荐使用
 */
public class DuplicationCheck {

    private static DuplicationCheck instance;

    private DuplicationCheck(){

    }

    public static DuplicationCheck getInstance(){
        if (instance == null){
            synchronized (DuplicationCheck.class){
                if (instance == null){
                    instance = new DuplicationCheck();
                }
            }
        }
        return instance;
    }
}
