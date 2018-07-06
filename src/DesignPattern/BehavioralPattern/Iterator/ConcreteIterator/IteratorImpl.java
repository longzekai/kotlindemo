package DesignPattern.BehavioralPattern.Iterator.ConcreteIterator;

import DesignPattern.BehavioralPattern.Iterator.Aggregate.List;
import DesignPattern.BehavioralPattern.Iterator.Iterator.Iterator;


/**
 * Created by Danny on 2018/7/6.
 */
public class IteratorImpl implements Iterator {

    List list ;
    int index ;

    public IteratorImpl(List list) {
        this.list = list;
        index = 0 ;
    }

    @Override
    public Object next() {
        Object obj = list.get(index) ;
        index ++ ;
        return obj;
    }

    @Override
    public void first() {
        index = 0 ;
    }

    @Override
    public void last() {
        index = list.getSize() ;
    }

    @Override
    public boolean hasNext() {
        return index < list.getSize() ;
    }
}
