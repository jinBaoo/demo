package com.fm.singleton;

/** 单例懒汉式/静态内部类
 * @author moore
 * @Date ${date} ${time}
 */
public class Singleton5 {
    private  static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }
    private Singleton5() {
    }
    public static  final  Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
