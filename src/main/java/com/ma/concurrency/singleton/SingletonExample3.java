package com.ma.concurrency.singleton;

import com.ma.concurrency.annoations.ThreadSafe;

/**
 * 懒汉模式（线程安全）
 */
@ThreadSafe
public class SingletonExample3 {
    //单例对象
    private static SingletonExample3 instance = null;
    //私有的构造函数
    private SingletonExample3(){

    }
    public static synchronized SingletonExample3 getInstance(){
        if(instance == null){
            instance = new SingletonExample3();
        }
        return instance;
    }
}
