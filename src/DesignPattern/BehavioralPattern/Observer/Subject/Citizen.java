package DesignPattern.BehavioralPattern.Observer.Subject;

import DesignPattern.BehavioralPattern.Observer.Observer.Policeman;

import java.util.ArrayList;

/**
 * Created by Danny on 2018/7/7.
 */
public abstract class Citizen {
    protected ArrayList<Policeman> pols ;

    String help = "normal";

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public abstract void sendMessage(String help);

    public void setPolicemen(){
        this.pols = new ArrayList() ;
    }

    public void register(Policeman pol){
        this.pols.add(pol) ;
    }

    public void unRegister(Policeman pol){
        this.pols.remove(pol) ;
    }
}
