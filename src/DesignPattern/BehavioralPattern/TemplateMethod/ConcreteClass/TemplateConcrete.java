package DesignPattern.BehavioralPattern.TemplateMethod.ConcreteClass;

import DesignPattern.BehavioralPattern.TemplateMethod.AbstractClass.Template;

/**
 * Created by Danny on 2018/7/7.
 */
public class TemplateConcrete extends Template {
    @Override
    public void print() {
        System.out.println("这是子类的实现");
    }
}
