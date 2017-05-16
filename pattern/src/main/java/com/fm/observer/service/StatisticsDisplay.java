package com.fm.observer.service;

import com.fm.observer.port.DisplayElement;
import com.fm.observer.port.Observer;
import com.fm.observer.port.Subject;

/**
 * Created by Administrator on 2017/4/17 0017.
 */
public class StatisticsDisplay  implements Observer,DisplayElement{

    private Float temperature;

    private Float humidity;

    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
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
        System.out.println("Statistics: " + temperature + " F degrees and " +humidity + " % humidity");
    }
}
