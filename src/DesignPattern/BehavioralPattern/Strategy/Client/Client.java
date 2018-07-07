package DesignPattern.BehavioralPattern.Strategy.Client;

import DesignPattern.BehavioralPattern.Strategy.ConcreteStrategy.StrategyImplA;
import DesignPattern.BehavioralPattern.Strategy.ConcreteStrategy.StrategyImplB;
import DesignPattern.BehavioralPattern.Strategy.ConcreteStrategy.StrategyImplC;
import DesignPattern.BehavioralPattern.Strategy.Context.Context;

/**
 * Created by Danny on 2018/7/4.
 */
public class Client {
    public static void main(String[] args) {
        Context ctx = new Context(new StrategyImplA());
        ctx.doMethod();

        ctx = new Context(new StrategyImplB());
        ctx.doMethod();

        ctx = new Context(new StrategyImplC());
        ctx.doMethod();
    }
}
