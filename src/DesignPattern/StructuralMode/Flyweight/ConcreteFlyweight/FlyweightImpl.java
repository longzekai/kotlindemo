package DesignPattern.StructuralMode.Flyweight.ConcreteFlyweight;

import DesignPattern.StructuralMode.Flyweight.Flyweight.Flyweight;

/**
 * Created by Danny on 2018/6/28.
 */
public class FlyweightImpl implements Flyweight {
    @Override
    public void action(int arg) {
        System.out.println("参数值: " + arg);
    }
}
