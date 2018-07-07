package DesignPattern.BehavioralPattern.Memento.Memento;

/**
 * Created by Danny on 2018/7/7.
 */
public class Memento {
    String state ;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
