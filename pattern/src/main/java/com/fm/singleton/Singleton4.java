package com.fm.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 单例模式
 * @author moore  Administrator
 * @Date 2017/5/19 0019 下午 1:52
 */
public class Singleton4 {
    private static final Logger LOGGER = LoggerFactory.getLogger(Singleton4.class);
    private static class SingletonHolder{
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    private Singleton4() {
        LOGGER.info("调用构造器");
    }
    public static final Singleton4 getInstance() {
        LOGGER.info("调用静态内部类创建实例");
        return SingletonHolder.INSTANCE;
    }

    public void showMessage() {
        System.out.println("单例模式 静态内部类");
    }

    public static void mian(String [] args) {
        Singleton4.getInstance().showMessage();
    }

    public static void main(String[] args) {
        Singleton4.getInstance().showMessage();
    }
}
