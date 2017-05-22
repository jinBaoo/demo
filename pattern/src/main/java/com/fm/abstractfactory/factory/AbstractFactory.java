package com.fm.abstractfactory.factory;

import com.fm.abstractfactory.insterface.Color;
import com.fm.abstractfactory.insterface.Shape;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
public abstract  class AbstractFactory {
    public abstract Color getColor(String color);
   public  abstract Shape getShape(String shape);
}
