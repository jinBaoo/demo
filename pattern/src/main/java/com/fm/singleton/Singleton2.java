package com.fm.singleton;

/** 单例模式 懒汉式
 * @author moore
 * @Date ${date} ${time}
 */
public class Singleton2 {
    private static Singleton2 instance = null;
    private Singleton2() {
    }
    public static Singleton2 getInstance() {
        if(null != instance) {
            instance = new Singleton2();
        }
        return  instance;
    }
}
