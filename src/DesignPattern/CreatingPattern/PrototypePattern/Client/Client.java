package DesignPattern.CreatingPattern.PrototypePattern.Client;

import DesignPattern.CreatingPattern.PrototypePattern.ConcretePrototype.ConcretePrototype;
import DesignPattern.CreatingPattern.PrototypePattern.Prototype.Prototype;

/**
 * Created by Danny on 2018/6/26.
 */
public class Client {
    public static void main(String[] args) {
        Prototype pro = new ConcretePrototype("Prototype") ;
        Prototype pro2 = (Prototype) pro.clone();

        System.out.println(pro.getName());

        System.out.println(pro2.getName());
    }
}
