package DesignPattern.Examples.FactoryMethod.IO;

/**
 * Created by Danny on 2018/6/27.
 */
public class Client {
    public static void main(String[] args) {
        IOHandler db = IOFactory.getIOHandler(DBHandler.class) ;
        System.out.println(db.query("44444444"));

        IOHandler xml = IOFactory.getIOHandler(XMLHandler.class);
        System.out.println(xml.query("33333333333"));

        IOHandler file = IOFactory.getIOHandler(FileHandler.class);
        System.out.println(file.query("22222222222222"));
    }
}
