package DesignPattern.StructuralMode.CompositePattern.Client;

import DesignPattern.StructuralMode.CompositePattern.Component.Employer;
import DesignPattern.StructuralMode.CompositePattern.Composite.ProjectManager;
import DesignPattern.StructuralMode.CompositePattern.Leaf.Programmer;
import DesignPattern.StructuralMode.CompositePattern.Leaf.ProjectAssistant;

import java.util.List;

/**
 * Created by Danny on 2018/6/28.
 */
public class Client {
    public static void main(String[] args) {
        Employer pm = new ProjectManager("项目经理") ;
        Employer pa = new ProjectAssistant("项目助理");
        Employer programmer1 = new Programmer("程序员一");
        Employer programmer2 = new Programmer("程序员二");
        pm.add(pa);
        pm.add(programmer2);

        List<Employer> ems = pm.getEmployers() ;
        System.out.println("项目经理有以下下属：");
        for(Employer em : ems) {
            System.out.println(em.getName());
        }
    }
}
