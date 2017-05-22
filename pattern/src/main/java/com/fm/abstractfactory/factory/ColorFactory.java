package com.fm.abstractfactory.factory;

import com.fm.abstractfactory.implement.Blue;
import com.fm.abstractfactory.implement.Green;
import com.fm.abstractfactory.implement.Red;
import com.fm.abstractfactory.insterface.Color;
import com.fm.abstractfactory.insterface.Shape;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if(null == color) {
            return null;
        }
        if(color.equalsIgnoreCase("red")) {
            return new Red();
        }else if(color.equalsIgnoreCase("blue")) {
            return new Blue();
        }else if(color.equalsIgnoreCase("green")) {
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {

        return null;
    }
}
