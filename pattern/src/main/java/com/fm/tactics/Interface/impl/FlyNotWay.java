package com.fm.tactics.Interface.impl;

import com.fm.tactics.Interface.FlyBehavior;

/**
 * Created by Administrator on 2017/4/13 0013.
 */
public class FlyNotWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I con't fly");
    }
}
