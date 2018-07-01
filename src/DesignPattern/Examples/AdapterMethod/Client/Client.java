package DesignPattern.Examples.AdapterMethod.Client;

import DesignPattern.Examples.AdapterMethod.Adaptee.Volt220;
import DesignPattern.Examples.AdapterMethod.Adapter.VoltAdapter;
import DesignPattern.Examples.AdapterMethod.Adapter.VoltAdatper2;

public class Client {
    public static void main(String[] args) {
        VoltAdapter volt220 = new VoltAdapter() ;
        System.out.println(volt220.getVolt220());
        System.out.println(volt220.getFiveVolt());

        VoltAdatper2 voltAdatper2 = new VoltAdatper2(new Volt220()) ;
        System.out.println(voltAdatper2.getFiveVolt());
    }
}
