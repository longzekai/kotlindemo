package DesignPattern.BehavioralPattern.Mediator.ConcreteMediator;

import DesignPattern.BehavioralPattern.Mediator.Colleagueclass.ColleagueA;
import DesignPattern.BehavioralPattern.Mediator.Colleagueclass.ColleagueB;
import DesignPattern.BehavioralPattern.Mediator.Mediator.Mediator;

/**
 * Created by Danny on 2018/7/6.
 */
public class ConcreteMediator extends Mediator {

    ColleagueA ca ;
    ColleagueB cb ;

    public ConcreteMediator() {
        ca = new ColleagueA() ;
        cb = new ColleagueB() ;
    }

    @Override
    public void notice(String content) {
        if (content.equals("boss")) {
            //老板来了, 通知员工A
            ca.action();
        }

        if (content.equals("client")) {
            //客户来了, 通知前台B
            cb.action();
        }
    }
}
