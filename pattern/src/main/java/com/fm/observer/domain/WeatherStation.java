package com.fm.observer.domain;

import com.fm.observer.service.CurrentDisplay;
import com.fm.observer.service.ForecastDisplay;
import com.fm.observer.service.WeatherData;

/**
 * Created by Administrator on 2017/4/17 0017.
 */
public class WeatherStation {


    public static void main(String[] args){
        //WeatherDate data = new WeatherDate();
        //CurrentConditionsDIsplay currentDisplay = new CurrentConditionsDIsplay(data);
        //StatisticsDisplay statisticsDisplay = new StatisticsDisplay(data);
        //data.setMeasureMents(80f,65f,30.5f);
        //data.setMeasureMents(70f,44f,36.5f);

        WeatherData data = new WeatherData();
        CurrentDisplay display = new CurrentDisplay(data);
        ForecastDisplay display1 = new ForecastDisplay(data);

        data.setMeasurements(80f,65f,30.5f);


    }

}
