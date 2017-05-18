package com.fm.singleton;

/**双锁 饿汉单例模式
 * @author moore
 * @Date ${date} ${time}
 */
public class Singleton4 {
    private static volatile Singleton4 instance = null;

    private Singleton4() {
    }
    public static Singleton4 getInstance() {
        if(null == instance) {
            synchronized (Singleton4.class) {
                if(null == instance) {
                    instance = new Singleton4();
                }
            }

        }
        return instance;
    }
}
