package com.fm.abstractfactory.implement;

import com.fm.abstractfactory.insterface.Color;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");

    }
}
