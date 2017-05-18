package com.fm.singleton;

/** 单例模式 懒汉式 加锁
 * @author moore
 * @Date ${date} ${time}
 */
public class Singleton3 {
    private static Singleton3 instance= null;

    private Singleton3() {
    }
    public static  synchronized Singleton3 getInstance() {
        if(null == instance) {
            instance = new Singleton3();
        }
        return instance;
    }
}
