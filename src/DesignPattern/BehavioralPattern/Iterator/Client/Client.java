package DesignPattern.BehavioralPattern.Iterator.Client;

import DesignPattern.BehavioralPattern.Iterator.Aggregate.List;
import DesignPattern.BehavioralPattern.Iterator.ConcreteAggregate.ListImpl;
import DesignPattern.BehavioralPattern.Iterator.Iterator.Iterator;

/**
 * Created by Danny on 2018/7/4.
 */
public class Client {
    public static void main(String[] args) {
        List list = new ListImpl() ;
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator iterator = list.iterator() ;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=====");
        //第二种迭代方式
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }
    }
}
