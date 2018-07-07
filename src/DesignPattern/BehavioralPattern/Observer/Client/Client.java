package DesignPattern.BehavioralPattern.Observer.Client;

import DesignPattern.BehavioralPattern.Observer.ConcreteObserver.HuangPuPoliceman;
import DesignPattern.BehavioralPattern.Observer.ConcreteObserver.TianHePoliceman;
import DesignPattern.BehavioralPattern.Observer.ConcreteSubject.HuangPuCitizen;
import DesignPattern.BehavioralPattern.Observer.ConcreteSubject.TianHeCitizen;
import DesignPattern.BehavioralPattern.Observer.Observer.Policeman;
import DesignPattern.BehavioralPattern.Observer.Subject.Citizen;

/**
 * Created by Danny on 2018/7/4.
 */
public class Client {
    public static void main(String[] args) {
        Policeman thpol = new TianHePoliceman() ;
        Policeman hppol = new HuangPuPoliceman() ;
        Citizen citizen = new HuangPuCitizen(hppol);
        citizen.sendMessage("unnormal");
        citizen.sendMessage("normal");

        System.out.println("===========");

        citizen = new TianHeCitizen(thpol);
        citizen.sendMessage("normal");
        citizen.sendMessage("unnormal");

        System.out.println("===========");
        citizen.unRegister(thpol);

        citizen.sendMessage("normal");
    }
}
