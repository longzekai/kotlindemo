package DesignPattern.Examples.AdapterMethod.Adapter;

import DesignPattern.Examples.AdapterMethod.Adaptee.Volt220;
import DesignPattern.Examples.AdapterMethod.Target.FiveVolt;

/**
 * 对象适配器模式
 */
public class VoltAdatper2 implements FiveVolt{

    Volt220 volt220 ;

    public VoltAdatper2(Volt220 adaptee) {
        volt220 = adaptee ;
    }

    public int getVolt220() {
        return volt220.getVolt220();
    }

    @Override
    public int getFiveVolt() {
        return 5;
    }
}
