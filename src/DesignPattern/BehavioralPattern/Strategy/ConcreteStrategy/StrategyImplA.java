package DesignPattern.BehavioralPattern.Strategy.ConcreteStrategy;

import DesignPattern.BehavioralPattern.Strategy.Strategy.Strategy;

/**
 * Created by Danny on 2018/7/7.
 */
public class StrategyImplA extends Strategy {
    @Override
    public void method() {
        System.out.println("这是第一个实现");
    }
}
