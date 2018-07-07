package DesignPattern.BehavioralPattern.Visitor.Element;

import DesignPattern.BehavioralPattern.Visitor.Visitor.Visitor;

/**
 * Created by Danny on 2018/7/7.
 */
public interface Visitable {
    void accept(Visitor visitor);
}
