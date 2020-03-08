package com.hj.learn.designpattern;

/**
 * 单例模式
 */

// 基础单例模式
public class Singleton {
    // 直接在类加载的时候就实例化了
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }
}

// 懒汉模式
class SingletonLazy {
    private static SingletonLazy singletonLazy = new SingletonLazy();

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (null == singletonLazy) {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }
}


