package DesignPattern.CreatingPattern.FactoryMethod.ConcreteProduct;

import DesignPattern.CreatingPattern.FactoryMethod.Product.Work;

/**
 * Created by Danny on 2018/6/26.
 */
public class TeacherWork implements Work {
    @Override
    public void doWork() {
        System.out.println("老师审批作业!");
    }
}
