package com.fm.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *单例 饿汉式
 * @author moore  Administrator
 * @Date 2017/5/19 0019 上午 10:38
 */
public class Singleton {

    private static Logger logger = LoggerFactory.getLogger(Singleton.class);
    //创建对象
    private static Singleton instance = new Singleton();
    //私有化构造器
    private Singleton() {
        logger.info("调用构造器");
    }
    //提供过去实例方法
    public static Singleton getInstance() {
        logger.info("调用获取实例方法");
        return instance;
    }

    public void  showMessage() {
        logger.info("调用普通方法");
        System.out.println("单例懒汉式方法");
    }
    public static void main(String[] args) {
        Singleton.getInstance().showMessage();
    }

}
