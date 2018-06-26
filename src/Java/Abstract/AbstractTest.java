package Java.Abstract;

/**
 * Created by Danny on 2018/6/26.
 */
public class AbstractTest {

    public static void main(String[] args) {
        B b = new B() ;
    }
}
abstract class A {
    public A(){
        System.out.println("A. 抽象类总的构造方法。");
    }
}

class B extends A {
    public B(){
        System.out.println("B、子类中的构造方法。");
    }
}