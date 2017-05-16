package com.fm.observer.service;

import java.util.Observable;

/**
 * Created by Administrator on 2017/4/17 0017.
 */
public class WeatherData extends Observable {

    private Float temperature;

    private Float humidity;

    private Float pressure;

    public WeatherData() {
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(Float temperature ,Float humidity,Float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    public Float getTemperature() {
        return temperature;
    }

    public Float getHumidity() {
        return humidity;
    }

    public Float getPressure() {
        return pressure;
    }
}
