package DesignPattern.CreatingPattern.BuilderMode.ConcreteBuilder;

import DesignPattern.CreatingPattern.BuilderMode.Builder.PersonBuilder;
import DesignPattern.CreatingPattern.BuilderMode.Product.Man;
import DesignPattern.CreatingPattern.BuilderMode.Product.Person;

/**
 * Created by Danny on 2018/6/26.
 */
public class ManBuilder implements PersonBuilder {

    Person person ;

    public ManBuilder() {
        person = new Man() ;
    }

    @Override
    public void buildHead() {
        person.setHead("建造男人的头");
    }

    @Override
    public void buildBody() {
        person.setBody("建造男人的身体");
    }

    @Override
    public void buildFoot() {
        person.setFoot("建造男人的脚");
    }

    @Override
    public Person buildPerson() {
        return person ;
    }
}
