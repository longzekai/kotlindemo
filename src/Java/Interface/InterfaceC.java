package Java.Interface;

/**
 * Created by Danny on 2018/6/27.
 */
public class InterfaceC implements InterfaceA,InterfaceB {
    @Override
    public void say() {
        System.out.println("Hello "+getInfo());
    }

    @Override
    public void print() {
        System.out.println("Author:"+ AUTHOR);
    }

    @Override
    public String getInfo() {
        return "Danny";
    }
}
