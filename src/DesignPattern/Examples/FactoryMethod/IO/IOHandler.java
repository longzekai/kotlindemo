package DesignPattern.Examples.FactoryMethod.IO;

/**
 * Created by Danny on 2018/6/27.
 */
public abstract class IOHandler {
    public abstract void add(String id, String name) ;

    public abstract void remove(String id) ;

    public abstract void update(String id, String name) ;

    public abstract String query(String id) ;
}
