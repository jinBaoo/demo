package com.fm.observer.service;

import com.fm.observer.port.DisplayElement;
import com.fm.observer.port.Observer;
import com.fm.observer.port.Subject;

/**
 * Created by Administrator on 2017/4/14 0014.
 */
public class CurrentConditionsDIsplay implements Observer,DisplayElement {
    private Float temperature;

    private Float humidity;

    private Subject weatherData;

    public CurrentConditionsDIsplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.regObserver(this);
    }

    @Override
    public void update(Float temp, Float humidity, Float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions : " + temperature + " F degrees and " +humidity + " % humidity");
    }
}
