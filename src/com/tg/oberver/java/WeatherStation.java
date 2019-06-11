package com.tg.oberver.java;

/**
 * 气象站 提供天气数据
 */
public class WeatherStation {
    public static void main(String[] arg) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 60.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(40, 55, 30.3f);
    }
}
