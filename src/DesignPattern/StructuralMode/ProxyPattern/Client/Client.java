package DesignPattern.StructuralMode.ProxyPattern.Client;

import DesignPattern.StructuralMode.ProxyPattern.Proxy.ProxyObject;
import DesignPattern.StructuralMode.ProxyPattern.Subject.Object;

/**
 * Created by Danny on 2018/6/28.
 */
public class Client {
    public static void main(String[] args) {

        Object object = new ProxyObject() ;
        object.action();

    }
}
