package com.fm.tactics.Interface.impl;

import com.fm.tactics.Interface.QuickBehavior;

/**
 * Created by Administrator on 2017/4/13 0013.
 */
public class MuteQuack implements QuickBehavior {

    @Override
    public void quick() {
        System.out.println("不叫................");
    }
}
