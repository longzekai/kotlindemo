package DesignPattern.CreatingPattern.Abstract.ConcreteFactory;

import DesignPattern.CreatingPattern.Abstract.AbstractFactory.IAnimalFactory;
import DesignPattern.CreatingPattern.Abstract.AbstractProduct.ICat;
import DesignPattern.CreatingPattern.Abstract.AbstractProduct.IDog;
import DesignPattern.CreatingPattern.Abstract.ConcreteProduct.WhiteCat;
import DesignPattern.CreatingPattern.Abstract.ConcreteProduct.WhiteDog;

/**
 * Created by Danny on 2018/6/26.
 */
public class WhiteAnimalFactory implements IAnimalFactory {
    @Override
    public ICat createCat() {
        return new WhiteCat();
    }

    @Override
    public IDog createDog() {
        return new WhiteDog();
    }
}
