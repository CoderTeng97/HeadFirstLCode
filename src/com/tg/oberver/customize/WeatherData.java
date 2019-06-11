package com.tg.oberver.customize;

import java.util.ArrayList;

/**
 * 天气数据来源
 */
public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (int i=0; i<observers.size(); i++){
            observers.get(i).update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
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
}
