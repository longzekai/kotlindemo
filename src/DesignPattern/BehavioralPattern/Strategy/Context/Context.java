package DesignPattern.BehavioralPattern.Strategy.Context;

import DesignPattern.BehavioralPattern.Strategy.Strategy.Strategy;

/**
 * Created by Danny on 2018/7/7.
 */
public class Context {
    Strategy stra ;

    public Context(Strategy stra) {
        this.stra = stra;
    }

    public void doMethod(){
        stra.method();
    }
}
