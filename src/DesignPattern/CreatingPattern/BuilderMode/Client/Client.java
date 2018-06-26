package DesignPattern.CreatingPattern.BuilderMode.Client;

import DesignPattern.CreatingPattern.BuilderMode.ConcreteBuilder.ManBuilder;
import DesignPattern.CreatingPattern.BuilderMode.Director.PersonDirector;
import DesignPattern.CreatingPattern.BuilderMode.Product.Person;

/**
 * Created by Danny on 2018/6/26.
 */
public class Client {
    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector() ;
        Person person = pd.constructPerson(new ManBuilder());
        System.out.println(person.getHead());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
    }
}
