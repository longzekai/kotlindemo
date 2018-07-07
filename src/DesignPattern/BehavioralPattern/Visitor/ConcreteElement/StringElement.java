package DesignPattern.BehavioralPattern.Visitor.ConcreteElement;

import DesignPattern.BehavioralPattern.Visitor.Element.Visitable;
import DesignPattern.BehavioralPattern.Visitor.Visitor.Visitor;

/**
 * Created by Danny on 2018/7/7.
 */
public class StringElement implements Visitable {

    String str ;

    public StringElement(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitString(this);
    }
}
