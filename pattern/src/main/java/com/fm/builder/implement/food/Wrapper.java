package com.fm.builder.implement.food;

import com.fm.builder.insterface.Packing;

/**
 * Created by Administrator on 2017/5/23 0023.
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
