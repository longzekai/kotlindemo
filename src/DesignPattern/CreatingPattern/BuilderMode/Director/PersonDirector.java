package DesignPattern.CreatingPattern.BuilderMode.Director;

import DesignPattern.CreatingPattern.BuilderMode.Builder.PersonBuilder;
import DesignPattern.CreatingPattern.BuilderMode.Product.Person;

/**
 * Created by Danny on 2018/6/26.
 */
public class PersonDirector {

    public Person constructPerson(PersonBuilder pb) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson() ;
    }

}
