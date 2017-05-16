package com.fm.observer.service;

import com.fm.observer.port.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2017/4/17 0017.
 */
public class CurrentDisplay implements Observer, DisplayElement {

    private Float temperature;

    private Float humidity;

    Observable observable;

    public CurrentDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("CurrentDisplay :" + temperature+ " F degress and " + humidity + "% humidity" );
    }

    @Override
    public void update(Observable o, Object arg) {

        if(o instanceof WeatherData) {
            WeatherData data  = (WeatherData) o;
            this.humidity = data.getHumidity();
            this.temperature = data.getTemperature();
            display();
        }
    }
}
