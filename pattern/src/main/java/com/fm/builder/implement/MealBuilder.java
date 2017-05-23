package com.fm.builder.implement;

import com.fm.builder.implement.drink.Coke;
import com.fm.builder.implement.drink.Pepsi;
import com.fm.builder.implement.food.ChickenBurger;
import com.fm.builder.implement.food.VegBurger;

/**
 * Created by Administrator on 2017/5/23 0023.
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;
    }
}
