package DesignPattern.StructuralMode.ProxyPattern.RealSubject;


import DesignPattern.StructuralMode.ProxyPattern.Subject.Object;

/**
 * Created by Danny on 2018/6/29.
 */
public class ObjectImpl implements Object {

    public void action(){
        System.out.println("========");
        System.out.println("========");
        System.out.println("这是被代理的类");
        System.out.println("========");
        System.out.println("========");
    }
}
