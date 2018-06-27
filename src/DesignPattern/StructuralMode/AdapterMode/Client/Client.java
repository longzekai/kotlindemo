package DesignPattern.StructuralMode.AdapterMode.Client;

import DesignPattern.StructuralMode.AdapterMode.Adaptee.Adaptee;
import DesignPattern.StructuralMode.AdapterMode.Adapter.Adapter;
import DesignPattern.StructuralMode.AdapterMode.Target.Target;

/**
 * Created by Danny on 2018/6/27.
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.adapteeMethod();
        target.adapterMethod();
    }
}
