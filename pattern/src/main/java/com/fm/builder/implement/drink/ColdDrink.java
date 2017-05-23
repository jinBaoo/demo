package com.fm.builder.implement.drink;

import com.fm.builder.insterface.Item;
import com.fm.builder.insterface.Packing;

/**
 * Created by Administrator on 2017/5/23 0023.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract  Float price() ;
}
