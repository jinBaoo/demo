package com.fm.builder.implement;

import com.fm.builder.insterface.Item;
import org.apache.shiro.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/23 0023.
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public Float getCost() {
        float cost = 0F;
        if(CollectionUtils.isEmpty(items)){
            return cost;
        }
        for (Item item: items) {
            cost += item.price();
        }
        return cost;
    }

    public  void showItems() {
        for (Item item : items ) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
