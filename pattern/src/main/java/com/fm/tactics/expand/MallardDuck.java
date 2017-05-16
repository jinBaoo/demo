package com.fm.tactics.expand;

import com.fm.tactics.Interface.impl.FlyWithWings;
import com.fm.tactics.Interface.impl.Quick;
import com.fm.tactics.entity.Duck;

/**
 * Created by Administrator on 2017/4/13 0013.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quickBehavior  = new Quick();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("i'm real Mallard Duck");
    }
}
