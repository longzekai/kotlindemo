package DesignPattern.BehavioralPattern.Command.Command;

import DesignPattern.BehavioralPattern.Command.Receiver.Receiver;

/**
 * Created by Danny on 2018/7/4.
 */
public abstract class Command {
    protected Receiver receiver ;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute() ;
}
