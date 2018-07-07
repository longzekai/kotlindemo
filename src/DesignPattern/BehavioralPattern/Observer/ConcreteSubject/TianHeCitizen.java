package DesignPattern.BehavioralPattern.Observer.ConcreteSubject;

import DesignPattern.BehavioralPattern.Observer.Observer.Policeman;
import DesignPattern.BehavioralPattern.Observer.Subject.Citizen;

/**
 * Created by Danny on 2018/7/7.
 */
public class TianHeCitizen extends Citizen {

    public TianHeCitizen(Policeman pol) {
        setPolicemen();
        register(pol);
    }

    public void sendMessage(String help) {
        setHelp(help);
        for (int i = 0; i < pols.size(); i++) {
            Policeman pol = pols.get(i);
            //通知警察行动
            pol.action(this);
        }
    }


}
