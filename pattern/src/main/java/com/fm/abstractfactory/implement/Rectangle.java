package com.fm.abstractfactory.implement;

import com.fm.abstractfactory.insterface.Shape;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
