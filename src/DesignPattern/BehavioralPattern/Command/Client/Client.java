package DesignPattern.BehavioralPattern.Command.Client;

import DesignPattern.BehavioralPattern.Command.Command.Command;
import DesignPattern.BehavioralPattern.Command.ConcreteCommand.CommandImpl;
import DesignPattern.BehavioralPattern.Command.Invoker.Invoker;
import DesignPattern.BehavioralPattern.Command.Receiver.Receiver;

/**
 * Created by Danny on 2018/7/4.
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver() ;
        Command cmd = new CommandImpl(receiver) ;
        Invoker invoker = new Invoker() ;
        invoker.setCommand(cmd);
        invoker.execute();
    }
}
