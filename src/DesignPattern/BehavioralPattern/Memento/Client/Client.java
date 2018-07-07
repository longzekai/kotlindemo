package DesignPattern.BehavioralPattern.Memento.Client;

import DesignPattern.BehavioralPattern.Memento.Caretaker.Caretaker;
import DesignPattern.BehavioralPattern.Memento.Originator.Originator;

/**
 * Created by Danny on 2018/7/4.
 */
public class Client {
    public static void main(String[] args) {
        Originator org = new Originator() ;
        org.setState("meeting..");
        Caretaker ck = new Caretaker() ;
        //将数据封装在Caretaker
        ck.setMemento(org.createMemento());

        org.setState("睡觉中");
        org.showState();
        //将数据重新导入
        org.setMemento(ck.getMemento());

        org.showState();
    }
}
