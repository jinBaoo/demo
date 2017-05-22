package com.fm.abstractfactory.domain;

import com.fm.abstractfactory.factory.AbstractFactory;
import com.fm.abstractfactory.factory.FactoryProducer;
import com.fm.abstractfactory.insterface.Color;
import com.fm.abstractfactory.insterface.Shape;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
public class Operation {
    public static void main(String[] args) {
        AbstractFactory shapeFactory   = FactoryProducer.getFacrory("SHAPE");
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape square = shapeFactory.getShape("square");
        square.draw();
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();
        AbstractFactory colorFactory = FactoryProducer.getFacrory("color");
        Color red = colorFactory.getColor("red");
        red.fill();
        Color blue = colorFactory.getColor("blue");
        blue.fill();
        Color green = colorFactory.getColor("green");
        green.fill();
    }
}
