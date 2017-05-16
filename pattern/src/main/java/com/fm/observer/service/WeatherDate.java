package com.fm.observer.service;

import com.fm.observer.port.Observer;
import com.fm.observer.port.Subject;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/14 0014.
 */
public class WeatherDate implements Subject {

    private ArrayList observers;

    private Float temperature;

    private Float humidity;

    private Float pressure;

    public WeatherDate() {
        this.observers = new ArrayList();
    }

    @Override
    public void regObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index > -1) {
            observers.remove(index);
        }

    }

    @Override
    public void notifyObserver() {
        for (int i = 0 ; i < observers.size();i++) {
            Observer o = (Observer)observers.get(i);
            o.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasureMents(Float temperature,Float humidity,Float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
