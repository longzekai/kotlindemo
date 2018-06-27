package DesignPattern.StructuralMode.AdapterMode.Adapter;

import DesignPattern.StructuralMode.AdapterMode.Adaptee.Adaptee;
import DesignPattern.StructuralMode.AdapterMode.Target.Target;

/**
 * Created by Danny on 2018/6/27.
 */
public class Adapter implements Target {

    private Adaptee adaptee ;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee ;
    }
    @Override
    public void adapterMethod() {
        System.out.println("Adapter method ~");
    }

    @Override
    public void adapteeMethod() {
        adaptee.adapteeMethod();
    }
}
