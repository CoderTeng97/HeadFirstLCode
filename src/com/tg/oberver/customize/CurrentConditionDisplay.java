package com.tg.oberver.customize;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperatureerature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Curent conditions :" + temperatureerature + "F degrees and" + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperatureerature = temperature;
        this.humidity = humidity;
        display();
    }
}
