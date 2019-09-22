package com.designPattern.creation.singleton.hungryMan;

/**
 * @author: zhenghailong
 * @date: 2019/9/22 21:42
 * @modified By:
 * @description:
 * 优点：写法简单，在类装载的时候实例化，避免线程同步问题。
 * 缺点：没有达到懒加载的效果，如果从始至终没有用到这个实例，则会造成内存的浪费
 */
public class HungryManSingleton {
    /**
     * 1.构造器私有，外部不能new
     */
    private HungryManSingleton(){

    }

    /**
     * 2.本类内部创建对象实例
     */
    private final static HungryManSingleton instance = new HungryManSingleton();

    // 也可以使用静态代码块实例化对象
    static {

    }
    /**
     * 3.提供一个公有的静态方法，返回实例对象
     * @return
     */
    public static HungryManSingleton getInstance(){
        return instance;
    }
}
