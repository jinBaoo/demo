package com.fm.singleton;

import org.junit.Test;

/**
 *@Author Moore
 *@Date 2017/5/17 0017 下午 6:08
 */
public class SingletonTest {

    /**
     *@Author Moore
     *@Date 2017/5/17 0017 下午 6:10
     */
    @Test
    public void  singletonTest() {
        SingletonPattern instance = SingletonPattern.getInstance();
    }
}
