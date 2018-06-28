package DesignPattern.StructuralMode.DecoratorPattern.Decorator;

import DesignPattern.StructuralMode.DecoratorPattern.Component.Person;

/**
 * Created by Danny on 2018/6/28.
 */
public class Decorator implements Person {

    Person person ;

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {
        person.eat();
    }
}
