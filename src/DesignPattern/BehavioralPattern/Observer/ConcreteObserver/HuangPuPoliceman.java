package DesignPattern.BehavioralPattern.Observer.ConcreteObserver;

import DesignPattern.BehavioralPattern.Observer.Observer.Policeman;
import DesignPattern.BehavioralPattern.Observer.Subject.Citizen;

/**
 * Created by Danny on 2018/7/7.
 */
public class HuangPuPoliceman implements Policeman {
    @Override
    public void action(Citizen ci) {
        String help = ci.getHelp() ;
        if (help.equals("normal")) {
            System.out.println("一切正常, 不用出动");
        }
        if (help.equals("unnormal")) {
            System.out.println("有犯罪行为, 黄埔警察出动!");
        }
    }
}
