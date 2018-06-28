package DesignPattern.StructuralMode.Flyweight.FlyweightFactory;

import DesignPattern.StructuralMode.Flyweight.ConcreteFlyweight.FlyweightImpl;
import DesignPattern.StructuralMode.Flyweight.Flyweight.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Danny on 2018/6/28.
 */
public class FlyweightFactory {
    private static Map<String,Flyweight> flyweights = new HashMap() ;

    public FlyweightFactory(String arg) {
        flyweights.put(arg,new FlyweightImpl()) ;
    }

    public static Flyweight getFlyweight(String key) {
        if (flyweights.get(key) == null) {
            flyweights.put(key,new FlyweightImpl()) ;
        }
        return flyweights.get(key);
    }

    public static int getSize(){
        return  flyweights.size() ;
    }
}
