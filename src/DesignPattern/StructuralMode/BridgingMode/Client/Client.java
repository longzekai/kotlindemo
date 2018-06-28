package DesignPattern.StructuralMode.BridgingMode.Client;

import DesignPattern.StructuralMode.BridgingMode.Abstraction.Person;
import DesignPattern.StructuralMode.BridgingMode.ConcreteImplementor.Jacket;
import DesignPattern.StructuralMode.BridgingMode.ConcreteImplementor.Trouser;
import DesignPattern.StructuralMode.BridgingMode.Implementor.Clothing;
import DesignPattern.StructuralMode.BridgingMode.RefinedAbstraction.Lady;
import DesignPattern.StructuralMode.BridgingMode.RefinedAbstraction.Man;

/**
 * Created by Danny on 2018/6/28.
 */
public class Client {
    public static void main(String[] args) {
        Person man = new Man() ;
        Person lady = new Lady() ;
        Clothing jacket = new Jacket() ;
        Clothing trouser = new Trouser() ;

        jacket.personDressCloth(man);
        jacket.personDressCloth(lady);

        trouser.personDressCloth(man);
        trouser.personDressCloth(lady);
    }
}
