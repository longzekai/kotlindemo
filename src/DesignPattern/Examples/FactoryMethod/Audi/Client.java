package DesignPattern.Examples.FactoryMethod.Audi;

/**
 * Created by Danny on 2018/6/26.
 */
public class Client {
    public static void main(String[] args) {
        AudiFactory acf = new AudiCarFactory() ;
        AudiQ3 q3 = acf.createAudiCar(AudiQ3.class) ;
        q3.drive();
        q3.selfNavigation();


        AudiQ5 q5 = acf.createAudiCar(AudiQ5.class);
        q5.drive();
        q5.selfNavigation();

        AudiQ7 q7 = acf.createAudiCar(AudiQ7.class);
        q7.drive();
        q7.selfNavigation();

    }
}
