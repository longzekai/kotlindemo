package DesignPattern.Examples.FactoryMethod.Audi;

/**
 * Created by Danny on 2018/6/26.
 */
public class AudiQ7 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("Audi Q7 start!");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q7 start navigation~");
    }
}
