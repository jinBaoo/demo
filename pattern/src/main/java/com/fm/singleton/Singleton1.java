package com.fm.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 单例 懒汉式 (线程不安全的)
 * @author moore  Administrator
 * @Date 2017/5/19 0019 上午 11:10
 */
public class Singleton1 {

    private static final Logger logger = LoggerFactory.getLogger(Singleton1.class);
    private static Singleton1 instance = null;

    private Singleton1() {
        logger.info("调用构造器");
    }

    public static Singleton1 getInstance() {
        logger.info("调用获取对象实例方法");
        if(null == instance) {
            instance = new Singleton1();
        }
        return instance;
    }

    public void showMassage() {
        System.out.println("调用普通方法");
    }

    public static void main (String[] args) {
        Singleton1.getInstance().showMassage();
    }
}
