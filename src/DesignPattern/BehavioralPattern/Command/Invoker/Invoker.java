package DesignPattern.BehavioralPattern.Command.Invoker;

import DesignPattern.BehavioralPattern.Command.Command.Command;

/**
 * Created by Danny on 2018/7/4.
 */
public class Invoker {
    Command command ;

    public void setCommand(Command command) {
        this.command = command ;
    }

    public void execute(){
        command.execute();
    }
}
