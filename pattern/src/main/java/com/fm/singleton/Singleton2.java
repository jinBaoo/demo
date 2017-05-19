package com.fm.singleton;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 单例 懒汉式 单锁
 * @author moore  Administrator
 * @Date 2017/5/19 0019 上午 11:39
 */
public class Singleton2 {
    private static final Logger LOGGER = LoggerFactory.getLogger(Singleton2.class);

    private  static  Singleton2 instance = null;

    private Singleton2() {
        LOGGER.info("调用构造器");
    }
    public static synchronized Singleton2 getInstance() {
        LOGGER.info("调用创建实例方法");
        if(null == instance) {
            instance = new Singleton2();
        }
        return instance;
    }
    public void showMessage() {
        System.out.println("单例 懒汉式 单锁");
    }
    public  static  void main(String[] args) {
        Singleton2.getInstance().showMessage();
    }
}
