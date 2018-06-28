package DesignPattern.StructuralMode.FacadePattern.Client;

import DesignPattern.StructuralMode.FacadePattern.Facade.Facade;
import DesignPattern.StructuralMode.FacadePattern.Subsystemclasses.ServiceA;
import DesignPattern.StructuralMode.FacadePattern.Subsystemclasses.ServiceAImpl;
import DesignPattern.StructuralMode.FacadePattern.Subsystemclasses.ServiceB;
import DesignPattern.StructuralMode.FacadePattern.Subsystemclasses.ServiceBImpl;

/**
 * Created by Danny on 2018/6/28.
 */
public class Client {
    public static void main(String[] args) {
        ServiceA serviceA = new ServiceAImpl() ;
        ServiceB serviceB = new ServiceBImpl() ;

        serviceA.methodA();
        serviceB.methodB();
        System.out.println("=========");

        Facade facade = new Facade() ;
        facade.methodA();
        facade.methodB();
    }
}
