package DesignPattern.BehavioralPattern.TemplateMethod.AbstractClass;

/**
 * Created by Danny on 2018/7/7.
 */
public abstract class Template {
    public abstract void print() ;

    public void update(){
        System.out.println("开始打印");
        for (int i = 0; i < 10; i++) {
            print();
        }
    }
}
