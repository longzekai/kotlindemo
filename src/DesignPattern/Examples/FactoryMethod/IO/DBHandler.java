package DesignPattern.Examples.FactoryMethod.IO;

/**
 * Created by Danny on 2018/6/27.
 */
public class DBHandler extends IOHandler {
    @Override
    public void add(String id, String name) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public void update(String id, String name) {

    }

    @Override
    public String query(String id) {
        return "Android";
    }
}
