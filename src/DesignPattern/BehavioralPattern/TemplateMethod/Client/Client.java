package DesignPattern.BehavioralPattern.TemplateMethod.Client;

import DesignPattern.BehavioralPattern.TemplateMethod.AbstractClass.Template;
import DesignPattern.BehavioralPattern.TemplateMethod.ConcreteClass.TemplateConcrete;

/**
 * Created by Danny on 2018/7/4.
 */
public class Client {
    public static void main(String[] args) {
        Template tm = new TemplateConcrete() ;
        tm.update();
    }
}
