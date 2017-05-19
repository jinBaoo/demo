package com.fm.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**单例 懒汉式 双锁
 * @author moore  Administrator
 * @Date 2017/5/19 0019 下午 1:41
 */
public class Singleton3 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Singleton3.class);
    private volatile static Singleton3 instance;

    private Singleton3() {
        LOGGER.info("调用构造器");
    }

    public static Singleton3 getInstance() {
        LOGGER.info("调用创建实例方法");
        if(null == instance) {
            synchronized (Singleton3.class) {
                if(null == instance) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
    public void showMessage() {
        System.out.println("单例 双锁 懒汉式");
    }

    public static void main(String[] args) {
        Singleton3.getInstance().showMessage();;
    }
}
