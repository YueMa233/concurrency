package com.ma.concurrency.singleton;

import com.ma.concurrency.annoations.ThreadSafe;

/**
 * 饿汉模式
 */
@ThreadSafe
public class SingletonExample2 {
    //单例对象
    private static SingletonExample2 instance = new SingletonExample2();
    //私有的构造函数
    private SingletonExample2(){
    }
    public static SingletonExample2 getInstance(){
        return instance;
    }
}
