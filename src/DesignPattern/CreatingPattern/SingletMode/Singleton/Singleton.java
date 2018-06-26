package DesignPattern.CreatingPattern.SingletMode.Singleton;

/**
 * Created by Danny on 2018/6/26.
 */
public class Singleton {
    private static Singleton singleton ;

    private Singleton(){}

    public static Singleton getInstance(){
        if (singleton == null) {
            singleton = new Singleton() ;
        }
        return singleton ;
    }
}
