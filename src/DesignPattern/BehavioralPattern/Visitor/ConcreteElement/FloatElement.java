package DesignPattern.BehavioralPattern.Visitor.ConcreteElement;

import DesignPattern.BehavioralPattern.Visitor.Element.Visitable;
import DesignPattern.BehavioralPattern.Visitor.Visitor.Visitor;

/**
 * Created by Danny on 2018/7/7.
 */
public class FloatElement implements Visitable {

    private Float fe;

    public FloatElement(Float fe) {
        this.fe = fe;
    }

    public Float getFe() {
        return this.fe;
    }

    public void accept(Visitor visitor) {
        visitor.visitFloat(this);
    }
}

