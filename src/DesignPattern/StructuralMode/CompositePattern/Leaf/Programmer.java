package DesignPattern.StructuralMode.CompositePattern.Leaf;

import DesignPattern.StructuralMode.CompositePattern.Component.Employer;

/**
 * Created by Danny on 2018/6/28.
 */
public class Programmer extends Employer {
    @Override
    public void add(Employer employer) {

    }

    @Override
    public void delete(Employer employer) {

    }

    public Programmer(String name) {
        setName(name);
        employers = null ;//程序员, 表示没有下属了
    }
}
