package DesignPattern.Examples.FactoryMethod;

/**
 * Created by Danny on 2018/6/26.
 */
public class AudiQ5 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("Audi Q5 start!");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q5 start navigation~");
    }
}
