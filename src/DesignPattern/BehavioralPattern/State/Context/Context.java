package DesignPattern.BehavioralPattern.State.Context;

import DesignPattern.BehavioralPattern.State.State.Weather;

/**
 * Created by Danny on 2018/7/7.
 */
public class Context {
    Weather weather ;

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String weatherMessage(){
        return  weather.getWeather() ;
    }
}
