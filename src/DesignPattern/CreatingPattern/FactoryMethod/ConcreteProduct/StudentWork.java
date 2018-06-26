package DesignPattern.CreatingPattern.FactoryMethod.ConcreteProduct;

import DesignPattern.CreatingPattern.FactoryMethod.Product.Work;

/**
 * Created by Danny on 2018/6/26.
 */
public class StudentWork implements Work {
    @Override
    public void doWork() {
        System.out.println("学生做作业!");
    }
}
