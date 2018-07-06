package DesignPattern.BehavioralPattern.Iterator.Aggregate;

import DesignPattern.BehavioralPattern.Iterator.Iterator.Iterator;

/**
 * Created by Danny on 2018/7/6.
 */
public interface List {
    Iterator iterator();

    Object get(int index);

    int getSize();

    void add(Object obj);

}
