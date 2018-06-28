package DesignPattern.StructuralMode.BridgingMode.RefinedAbstraction;

import DesignPattern.StructuralMode.BridgingMode.Abstraction.Person;
import DesignPattern.StructuralMode.BridgingMode.Implementor.Clothing;

/**
 * Created by Danny on 2018/6/28.
 */
public class Man extends Person {

    public Man(){
        setType("Man");
    }

    @Override
    public void dress() {
        Clothing clothing = getClothing() ;
        clothing.personDressCloth(this);
    }
}
