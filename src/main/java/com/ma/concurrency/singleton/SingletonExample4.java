package com.ma.concurrency.singleton;

import com.ma.concurrency.annoations.ThreadSafe;

/**
 * 双重检查机制(使用volatile保证不被指令重排序)
 */
@ThreadSafe
public class SingletonExample4 {
    //单例对象
    private volatile static SingletonExample4 instance = null;
    //私有的构造函数
    private SingletonExample4(){
    }
    //1、memory = allocate() 分配对象内存空间
    //2、ctoInstance() 初始化对象
    //3、instance = memory 设置instance指向刚分配的内存

    //JVM和CPU优化，发生了指令重排序
    //1、memory = allocate() 分配对象内存空间
    //3、instance = memory 设置instance指向刚分配的内存
    //2、ctoInstance() 初始化对象


    public static SingletonExample4 getInstance(){
        //使用双重检查机制
        if(instance == null){
            synchronized (SingletonExample4.class){
                if(instance == null){
                    instance = new SingletonExample4();
                }
            }
        }
        return instance;
    }
}
