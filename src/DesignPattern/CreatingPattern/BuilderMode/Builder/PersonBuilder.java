package DesignPattern.CreatingPattern.BuilderMode.Builder;

import DesignPattern.CreatingPattern.BuilderMode.Product.Person;

/**
 * Created by Danny on 2018/6/26.
 */
public interface PersonBuilder {
    void buildHead() ;

    void buildBody() ;

    void buildFoot() ;

    Person buildPerson() ;
}
