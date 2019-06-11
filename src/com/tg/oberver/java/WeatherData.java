package com.tg.oberver.java;

import com.tg.oberver.customize.Observer;
import com.tg.oberver.customize.Subject;

import java.util.ArrayList;
import java.util.Observable;

/**
 * 天气数据来源
 */
public class WeatherData extends Observable{
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;


    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    /**
     * 更新
     * @param temperature 温度
     * @param humidity [hjuːˈmɪdəti] 湿度
     * @param pressure [ˈpreʃə(r)] 气压
     * [ˈmɛʒəmənts] measurements 测量值
     */
    public  void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
