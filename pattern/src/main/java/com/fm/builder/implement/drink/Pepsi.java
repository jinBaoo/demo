package com.fm.builder.implement.drink;

/**
 * Created by Administrator on 2017/5/23 0023.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public Float price() {
        return 3.5F;
    }
}
