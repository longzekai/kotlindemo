package DesignPattern.StructuralMode.BridgingMode.ConcreteImplementor;

import DesignPattern.StructuralMode.BridgingMode.Abstraction.Person;
import DesignPattern.StructuralMode.BridgingMode.Implementor.Clothing;

/**
 * Created by Danny on 2018/6/28.
 */
public class Trouser extends Clothing {
    @Override
    public void personDressCloth(Person person) {
        System.out.println(person.getType() + "穿裤子");
    }
}
