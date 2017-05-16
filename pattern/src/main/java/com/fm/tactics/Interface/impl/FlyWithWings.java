package com.fm.tactics.Interface.impl;

import com.fm.tactics.Interface.FlyBehavior;

/**
 * Created by Administrator on 2017/4/13 0013.
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("i can flying");
    }
}
