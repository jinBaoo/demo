package com.fm.tactics.expand;

import com.fm.tactics.Interface.FlyBehavior;

/**
 * Created by Administrator on 2017/4/13 0013.
 */
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println(" i'm flying with a rocket");
    }
}
