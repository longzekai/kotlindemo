package DesignPattern.BehavioralPattern.Memento.Caretaker;

import DesignPattern.BehavioralPattern.Memento.Memento.Memento;

/**
 * Created by Danny on 2018/7/7.
 */
public class Caretaker {

    Memento memento ;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
