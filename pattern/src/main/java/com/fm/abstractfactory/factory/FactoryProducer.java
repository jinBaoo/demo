package com.fm.abstractfactory.factory;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
public class FactoryProducer {
    public static AbstractFactory getFacrory(String choise) {

        if(choise.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }else if(choise.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        }
        return null;
    }
}
