package com.tg.oberver.java;

import com.tg.oberver.customize.DisplayElement;
import com.tg.oberver.customize.Subject;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionDisplay(Observable observable) {
       this.observable = observable;
       observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Curent conditions :" + temperature + "F degrees and" + humidity + "% humidity");
    }


    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
