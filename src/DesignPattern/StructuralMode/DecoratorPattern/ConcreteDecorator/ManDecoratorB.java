package DesignPattern.StructuralMode.DecoratorPattern.ConcreteDecorator;

import DesignPattern.StructuralMode.DecoratorPattern.Decorator.Decorator;

/**
 * Created by Danny on 2018/6/28.
 */
public class ManDecoratorB extends Decorator{

    public void eat(){
        super.eat();
        System.out.println("===============");
        System.out.println("ManDecoratorB类");
    }
}
