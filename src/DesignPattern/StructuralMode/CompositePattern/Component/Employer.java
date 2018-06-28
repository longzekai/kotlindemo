package DesignPattern.StructuralMode.CompositePattern.Component;

import java.util.List;

/**
 * Created by Danny on 2018/6/28.
 */
public abstract class Employer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  abstract  void add(Employer employer) ;

    public abstract  void delete(Employer employer) ;

    public List<Employer> employers ;

    public void printInfo() {
        System.out.println(name);
    }

    public List<Employer> getEmployers() {
        return this.employers ;
    }
}
