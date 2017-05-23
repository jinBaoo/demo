package com.fm.builder.implement.food;

/**
 * Created by Administrator on 2017/5/23 0023.
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public Float price() {
        return 10.5F;
    }
}
