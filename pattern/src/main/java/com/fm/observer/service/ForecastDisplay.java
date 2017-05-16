package com.fm.observer.service;

import com.fm.observer.port.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2017/4/18 0018.
 */
public class ForecastDisplay implements Observer,DisplayElement{

    private Float currentPressure = 29.93f;

    private Float lastPressure;

    Observable observable ;
    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);

    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            currentPressure = currentPressure;
            lastPressure = weatherData.getPressure();
            display();
         }
    }

    @Override
    public void display() {
        System.out.println("jjej");
    }

    public Float getCurrentPressure() {
        return currentPressure;
    }

    public Float getLastPressure() {
        return lastPressure;
    }
}
