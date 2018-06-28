package DesignPattern.StructuralMode.CompositePattern.Composite;

import DesignPattern.StructuralMode.CompositePattern.Component.Employer;

import java.util.ArrayList;

/**
 * Created by Danny on 2018/6/28.
 */
public class ProjectManager extends Employer {

    public ProjectManager(String name){
        setName(name);
        employers = new ArrayList();
    }

    @Override
    public void add(Employer employer) {
        employers.add(employer);
    }

    @Override
    public void delete(Employer employer) {
        employers.remove(employer);
    }
}
