package com.fm.builder.implement.drink;

/**
 * Created by Administrator on 2017/5/23 0023.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public Float price() {
        return 5.5F;
    }
}
