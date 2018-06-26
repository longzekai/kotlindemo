package DesignPattern.CreatingPattern.FactoryMethod.ConcreteCreator;

import DesignPattern.CreatingPattern.FactoryMethod.ConcreteProduct.StudentWork;
import DesignPattern.CreatingPattern.FactoryMethod.Creator.IWrokFactory;
import DesignPattern.CreatingPattern.FactoryMethod.Product.Work;

/**
 * Created by Danny on 2018/6/26.
 */
public class StudentWorkFactory implements IWrokFactory {
    @Override
    public Work getWork() {
        return new StudentWork();
    }
}
