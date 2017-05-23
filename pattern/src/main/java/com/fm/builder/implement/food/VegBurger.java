package com.fm.builder.implement.food;

/**
 * Created by Administrator on 2017/5/23 0023.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public Float price() {
        return 3.5F;
    }
}
