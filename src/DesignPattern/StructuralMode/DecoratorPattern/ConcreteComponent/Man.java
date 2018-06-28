package DesignPattern.StructuralMode.DecoratorPattern.ConcreteComponent;

import DesignPattern.StructuralMode.DecoratorPattern.Component.Person;

/**
 * Created by Danny on 2018/6/28.
 */
public class Man implements Person{
    @Override
    public void eat() {
        System.out.println("男人在吃");
    }
}
