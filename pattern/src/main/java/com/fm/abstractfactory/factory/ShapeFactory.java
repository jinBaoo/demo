package com.fm.abstractfactory.factory;

import com.fm.abstractfactory.implement.Circle;
import com.fm.abstractfactory.implement.Rectangle;
import com.fm.abstractfactory.implement.Square;
import com.fm.abstractfactory.insterface.Color;
import com.fm.abstractfactory.insterface.Shape;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        if(null == shape) {
            return null;
        }
        if(shape.equalsIgnoreCase("square")) {
            return new Square();
        }else if(shape.equalsIgnoreCase("circle")) {
            return new Circle();

        }else if(shape.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        return  null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
