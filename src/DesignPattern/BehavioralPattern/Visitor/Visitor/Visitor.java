package DesignPattern.BehavioralPattern.Visitor.Visitor;

import DesignPattern.BehavioralPattern.Visitor.ConcreteElement.FloatElement;
import DesignPattern.BehavioralPattern.Visitor.ConcreteElement.StringElement;

import java.util.Collection;

/**
 * Created by Danny on 2018/7/7.
 */
public interface Visitor {
    void visitString(StringElement se);

    void visitFloat(FloatElement floatE);

    void visitCollection(Collection collection);
}
