package DesignPattern.BehavioralPattern.Visitor.ConcreteVisitor;

import DesignPattern.BehavioralPattern.Visitor.ConcreteElement.FloatElement;
import DesignPattern.BehavioralPattern.Visitor.ConcreteElement.StringElement;
import DesignPattern.BehavioralPattern.Visitor.Element.Visitable;
import DesignPattern.BehavioralPattern.Visitor.Visitor.Visitor;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Danny on 2018/7/7.
 */
public class ConcreteVisitor implements Visitor {

    public void visitCollection(Collection collection) {
        // TODO Auto-generated method stub
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o instanceof Visitable) {
                ((Visitable)o).accept(this);
            }
        }
    }

    public void visitFloat(FloatElement floatE) {
        System.out.println(floatE.getFe());
    }

    public void visitString(StringElement stringE) {
        System.out.println(stringE.getStr());
    }

}
