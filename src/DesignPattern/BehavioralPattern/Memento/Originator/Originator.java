package DesignPattern.BehavioralPattern.Memento.Originator;

import DesignPattern.BehavioralPattern.Memento.Memento.Memento;

/**
 * Created by Danny on 2018/7/7.
 */
public class Originator {
    String  state ;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void setMemento(Memento memento){
        state = memento.getState() ;
    }

    public void showState(){
        System.out.println(state);
    }
}
