package com.fm.tactics.expand;

import com.fm.tactics.Interface.impl.FlyNotWay;
import com.fm.tactics.Interface.impl.MuteQuack;
import com.fm.tactics.entity.Duck;

/**
 * Created by Administrator on 2017/4/13 0013.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNotWay();
        quickBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("i'm model Duck");
    }

}
