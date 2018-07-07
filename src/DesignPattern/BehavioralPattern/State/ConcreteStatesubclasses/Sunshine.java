package DesignPattern.BehavioralPattern.State.ConcreteStatesubclasses;

import DesignPattern.BehavioralPattern.State.State.Weather;

/**
 * Created by Danny on 2018/7/7.
 */
public class Sunshine implements Weather {
    @Override
    public String getWeather() {
        return "阳光";
    }
}
