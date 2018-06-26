package DesignPattern.CreatingPattern.Abstract.ConcreteProduct;

import DesignPattern.CreatingPattern.Abstract.AbstractProduct.ICat;

/**
 * Created by Danny on 2018/6/26.
 */
public class WhiteCat implements ICat {
    @Override
    public void eat() {
        System.out.println("The white cat is eating!");
    }
}
