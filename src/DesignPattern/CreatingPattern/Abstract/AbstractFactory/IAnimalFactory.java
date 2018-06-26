package DesignPattern.CreatingPattern.Abstract.AbstractFactory;

import DesignPattern.CreatingPattern.Abstract.AbstractProduct.ICat;
import DesignPattern.CreatingPattern.Abstract.AbstractProduct.IDog;

/**
 * Created by Danny on 2018/6/26.
 */
public interface IAnimalFactory {
    ICat createCat();
    IDog createDog();
}
