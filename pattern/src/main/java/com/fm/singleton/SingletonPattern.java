package com.fm.singleton;

/**
 *@Author Moore
 *@Date 2017/5/17 0017 下午 6:00
 */
public class SingletonPattern {
    /**
     *
     *单例饿汉式
     */
    private static  SingletonPattern instance = new SingletonPattern();

    private SingletonPattern() {
    }

    public static SingletonPattern getInstance() {
        return instance;
    }

}
