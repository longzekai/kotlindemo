package DesignPattern.StructuralMode.CompositePattern.Leaf;

import DesignPattern.StructuralMode.CompositePattern.Component.Employer;

/**
 * Created by Danny on 2018/6/28.
 */
public class ProjectAssistant extends Employer{

    public ProjectAssistant(String name) {
        setName(name);
        employers = null;//项目助理, 表示没有下属了
    }


    @Override
    public void add(Employer employer) {

    }

    @Override
    public void delete(Employer employer) {

    }
}
