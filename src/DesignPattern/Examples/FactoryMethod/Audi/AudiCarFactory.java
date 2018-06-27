package DesignPattern.Examples.FactoryMethod.Audi;

/**
 * Created by Danny on 2018/6/26.
 */
public class AudiCarFactory extends AudiFactory {
    @Override
    public <T extends AudiCar> T createAudiCar(Class<T> clz) {
        AudiCar car = null ;
        try {
            car = (AudiCar) Class.forName(clz.getName()).newInstance();
        } catch (Exception e){
            e.printStackTrace();
        }
        return (T) car;
    }
}
