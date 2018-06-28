package DesignPattern.StructuralMode.DecoratorPattern.ConcreteDecorator;

import DesignPattern.StructuralMode.DecoratorPattern.Decorator.Decorator;

/**
 * Created by Danny on 2018/6/28.
 */
public class ManDecoratorA extends Decorator {
    public void eat(){
        super.eat();
        reEat();
        System.out.println("ManDecoratorA类");
    }

    public void reEat() {
        System.out.println("再吃一顿饭");
    }
}
