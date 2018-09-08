package com.ma.concurrency.singleton;

import com.ma.concurrency.annoations.ThreadSafe;

/**
 * 枚举(最安全的)
 */
@ThreadSafe
public class SingletonExample6 {
    //私有的构造函数
    private SingletonExample6(){
    }
    public static SingletonExample6 getInstance(){
        return Single.INSTANCE.getInstance();
    }
    private  enum Single{
        INSTANCE;
        private SingletonExample6 singleton;
        Single(){
            singleton = new SingletonExample6();
        }
        public SingletonExample6 getInstance(){
            return singleton;
        }
    }
}
