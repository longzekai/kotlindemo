package DesignPattern.CreatingPattern.SingletMode.Client;

import DesignPattern.CreatingPattern.SingletMode.Singleton.Singleton;
import DesignPattern.CreatingPattern.SingletMode.Singleton.Singleton2;

/**
 * Created by Danny on 2018/6/26.
 */
public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance() ;
        Singleton singleton1 = Singleton.getInstance() ;
        System.out.println(singleton);
        System.out.println(singleton1);

        Singleton2 singleton2 = Singleton2.getInstance() ;
        Singleton2 singleton3 = Singleton2.getInstance() ;
        System.out.println(singleton2);
        System.out.println(singleton3);
    }
}
