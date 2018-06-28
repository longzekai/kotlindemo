package DesignPattern.StructuralMode.DecoratorPattern.Client;

import DesignPattern.StructuralMode.DecoratorPattern.ConcreteComponent.Man;
import DesignPattern.StructuralMode.DecoratorPattern.ConcreteDecorator.ManDecoratorA;
import DesignPattern.StructuralMode.DecoratorPattern.ConcreteDecorator.ManDecoratorB;

/**
 * Created by Danny on 2018/6/28.
 */
public class Client {
    public static void main(String[] args) {
        Man man = new Man() ;

        ManDecoratorA ma = new ManDecoratorA() ;
        ManDecoratorB mb = new ManDecoratorB() ;

        ma.setPerson(man);
        mb.setPerson(ma);
        mb.eat();
    }
}
