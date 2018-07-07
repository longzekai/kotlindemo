package DesignPattern.BehavioralPattern.Visitor.Client;

import DesignPattern.BehavioralPattern.Visitor.ConcreteElement.FloatElement;
import DesignPattern.BehavioralPattern.Visitor.ConcreteElement.StringElement;
import DesignPattern.BehavioralPattern.Visitor.ConcreteVisitor.ConcreteVisitor;
import DesignPattern.BehavioralPattern.Visitor.Visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Danny on 2018/7/4.
 */
public class Client {
    public static void main(String[] args) {
        Visitor visitor = new ConcreteVisitor() ;
        StringElement se = new StringElement("abc");
        se.accept(visitor);

        FloatElement fe = new FloatElement(1.5f) ;
        fe.accept(visitor);

        System.out.println("===========");

        List result = new ArrayList() ;
        result.add(new StringElement("abc"));
        result.add(new StringElement("abc"));
        result.add(new StringElement("abc"));
        result.add(new FloatElement(new Float(1.5)));
        result.add(new FloatElement(new Float(1.5)));
        result.add(new FloatElement(new Float(1.5)));
        visitor.visitCollection(result);

    }
}
