package DesignPattern.CreatingPattern.Abstract.Client;

import DesignPattern.CreatingPattern.Abstract.AbstractFactory.IAnimalFactory;
import DesignPattern.CreatingPattern.Abstract.AbstractProduct.ICat;
import DesignPattern.CreatingPattern.Abstract.AbstractProduct.IDog;
import DesignPattern.CreatingPattern.Abstract.ConcreteFactory.BlackAnimalFactory;
import DesignPattern.CreatingPattern.Abstract.ConcreteFactory.WhiteAnimalFactory;

/**
 * Created by Danny on 2018/6/26.
 */
public class Client {
    public static void main(String[] args) {
        IAnimalFactory blackAF = new BlackAnimalFactory() ;
        ICat blackCat = blackAF.createCat() ;
        blackCat.eat();
        IDog blackDog = blackAF.createDog() ;
        blackDog.eat();

        IAnimalFactory whiteAF = new WhiteAnimalFactory() ;
        ICat whiteCat = whiteAF.createCat() ;
        whiteCat.eat();
        IDog whiteDog = whiteAF.createDog() ;
        whiteDog.eat();
    }
}
