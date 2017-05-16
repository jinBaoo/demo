package com.fm.tactics.entity;

import com.fm.tactics.Interface.FlyBehavior;
import com.fm.tactics.Interface.QuickBehavior;

/**
 * Created by Administrator on 2017/4/13 0013.
 */
public abstract class Duck {

    public FlyBehavior flyBehavior;
    public QuickBehavior  quickBehavior;

    public void performQuack() {
        quickBehavior.quick();
    }

    public void performFly() {
        flyBehavior.fly();
    }
    public void swim() {
        System.out.println("游泳");
    }

    public abstract void display() ;


    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuickBehavior(QuickBehavior quickBehavior) {
        this.quickBehavior = quickBehavior;
    }
}
