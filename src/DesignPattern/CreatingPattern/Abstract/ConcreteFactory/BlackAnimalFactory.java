package DesignPattern.CreatingPattern.Abstract.ConcreteFactory;

import DesignPattern.CreatingPattern.Abstract.AbstractFactory.IAnimalFactory;
import DesignPattern.CreatingPattern.Abstract.AbstractProduct.ICat;
import DesignPattern.CreatingPattern.Abstract.AbstractProduct.IDog;
import DesignPattern.CreatingPattern.Abstract.ConcreteProduct.BlackCat;
import DesignPattern.CreatingPattern.Abstract.ConcreteProduct.BlackDog;

/**
 * Created by Danny on 2018/6/26.
 */
public class BlackAnimalFactory implements IAnimalFactory{
    @Override
    public ICat createCat() {
        return new BlackCat();
    }

    @Override
    public IDog createDog() {
        return new BlackDog();
    }
}
