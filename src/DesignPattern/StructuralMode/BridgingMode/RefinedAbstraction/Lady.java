package DesignPattern.StructuralMode.BridgingMode.RefinedAbstraction;

import DesignPattern.StructuralMode.BridgingMode.Abstraction.Person;
import DesignPattern.StructuralMode.BridgingMode.Implementor.Clothing;

/**
 * Created by Danny on 2018/6/28.
 */
public class Lady extends Person {

    public Lady(){
        setType("Lady");
    }

    @Override
    public void dress() {
        Clothing clothing = getClothing() ;
        clothing.personDressCloth(this);
    }
}
