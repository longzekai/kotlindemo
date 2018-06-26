package DesignPattern.CreatingPattern.Abstract.ConcreteProduct;

import DesignPattern.CreatingPattern.Abstract.AbstractProduct.IDog;

/**
 * Created by Danny on 2018/6/26.
 */
public class BlackDog implements IDog {
    @Override
    public void eat() {
        System.out.println("The black dog is eating");
    }
}
