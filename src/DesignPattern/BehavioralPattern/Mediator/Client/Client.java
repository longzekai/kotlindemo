package DesignPattern.BehavioralPattern.Mediator.Client;

import DesignPattern.BehavioralPattern.Mediator.ConcreteMediator.ConcreteMediator;
import DesignPattern.BehavioralPattern.Mediator.Mediator.Mediator;

/**
 * Created by Danny on 2018/7/4.
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator() ;
        mediator.notice("boss");
        mediator.notice("client");
    }
}
