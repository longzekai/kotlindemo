package DesignPattern.BehavioralPattern.Command.ConcreteCommand;

import DesignPattern.BehavioralPattern.Command.Command.Command;
import DesignPattern.BehavioralPattern.Command.Receiver.Receiver;

/**
 * Created by Danny on 2018/7/4.
 */
public class CommandImpl extends Command {


    public CommandImpl(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.receive();
    }
}
