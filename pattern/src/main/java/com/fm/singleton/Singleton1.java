package com.fm.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 单例饿汉式
 *@Author Moore
 *@Date 2017/5/18 0018 上午 10:20
 */
public class Singleton1 {
    private final static Logger logger = LoggerFactory.getLogger(Singleton1.class);
    private static Singleton1 instance = new Singleton1();
    private Singleton1() {
    }
    public static Singleton1 getInstance() {
        return instance;
    }
    public static void  main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        String formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(now);
        logger.info("开始时间 :"+formatter);
        Singleton1 instance = Singleton1.getInstance();
    }
}
