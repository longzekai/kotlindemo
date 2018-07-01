package DesignPattern.Examples.AdapterMethod.Adapter;

import DesignPattern.Examples.AdapterMethod.Adaptee.Volt220;
import DesignPattern.Examples.AdapterMethod.Target.FiveVolt;

/**
 * 类适配器模式
 */
public class VoltAdapter extends Volt220 implements FiveVolt {
    @Override
    public int getFiveVolt() {
        return 5;
    }
}
