package DesignPattern.BehavioralPattern.State.Client;

import DesignPattern.BehavioralPattern.State.ConcreteStatesubclasses.Rain;
import DesignPattern.BehavioralPattern.State.ConcreteStatesubclasses.Sunshine;
import DesignPattern.BehavioralPattern.State.Context.Context;

/**
 * Created by Danny on 2018/7/4.
 */
public class Client {
    public static void main(String[] args) {
        Context ctx = new Context() ;
        ctx.setWeather(new Sunshine());
        System.out.println(ctx.weatherMessage());

        System.out.println("===============");

        Context ctx2 = new Context() ;
        ctx2.setWeather(new Rain());
        System.out.println(ctx2.weatherMessage());
    }
}
