package DesignPattern.StructuralMode.BridgingMode.Abstraction;

import DesignPattern.StructuralMode.BridgingMode.Implementor.Clothing;

/**
 * Created by Danny on 2018/6/28.
 */
public abstract class Person {
    private Clothing clothing ;

    private String type ;

    public abstract void dress() ;

    public Clothing getClothing() {
        return clothing;
    }

    public void setClothing(Clothing clothing) {
        this.clothing = clothing;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
