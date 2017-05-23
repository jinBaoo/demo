package com.fm.builder.implement.drink;

import com.fm.builder.insterface.Packing;

/**
 * Created by Administrator on 2017/5/23 0023.
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
