package com.fm.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 单例 枚举
 * @author moore  Administrator
 * @Date 2017/5/19 0019 下午 2:08
 */
public enum Singleton5 {
    INSTANCE;
    private static final Logger LOGGER = LoggerFactory.getLogger(Singleton5.class);

    public void showMessage() {
        System.out.println(",枚举创建对象");
    }

    public static void main(String[] args) {
        Singleton5.INSTANCE.showMessage();
    }
}
