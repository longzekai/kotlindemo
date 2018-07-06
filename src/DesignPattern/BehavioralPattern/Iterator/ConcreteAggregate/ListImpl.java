package DesignPattern.BehavioralPattern.Iterator.ConcreteAggregate;

import DesignPattern.BehavioralPattern.Iterator.Aggregate.List;
import DesignPattern.BehavioralPattern.Iterator.ConcreteIterator.IteratorImpl;
import DesignPattern.BehavioralPattern.Iterator.Iterator.Iterator;

/**
 * Created by Danny on 2018/7/6.
 */
public class ListImpl implements List {

    Object[] list ;
    int  index ;
    int size ;

    public ListImpl() {
        index = 0 ;
        size = 0 ;
        list = new Object[100] ;
    }

    @Override
    public Iterator iterator() {
        return new IteratorImpl(this);
    }

    @Override
    public Object get(int index) {
        return list[index] ;
    }

    @Override
    public int getSize() {
        return this.size ;
    }

    @Override
    public void add(Object obj) {
        list[index++] = obj ;
        size++ ;
    }
}
