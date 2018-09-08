package com.ma.concurrency.singleton;

import com.ma.concurrency.annoations.NotThreadSafe;

/**
 * 懒汉模式
 */
@NotThreadSafe
public class SingletonExample1 {
    //单例对象
    private static SingletonExample1 instance = null;
    //私有的构造函数
    private SingletonExample1(){

    }
    public static SingletonExample1 getInstance(){
        if(instance == null){
            instance = new SingletonExample1();
        }
        return instance;
    }

}
