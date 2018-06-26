package DesignPattern.CreatingPattern.FactoryMethod.Client;

import DesignPattern.CreatingPattern.FactoryMethod.ConcreteCreator.StudentWorkFactory;
import DesignPattern.CreatingPattern.FactoryMethod.ConcreteCreator.TeacherWorkFactory;
import DesignPattern.CreatingPattern.FactoryMethod.Creator.IWrokFactory;

/**
 * Created by Danny on 2018/6/26.
 */
public class Client {
    public static void main(String[] args) {
        IWrokFactory swf = new StudentWorkFactory() ;
        swf.getWork().doWork();

        IWrokFactory twf = new TeacherWorkFactory() ;
        twf.getWork().doWork();
    }
}
