package Java.Interface;

/**
 * Created by Danny on 2018/6/27.
 */
public class Client {
    public static void main(String[] args) {
        InterfaceC c = new InterfaceC() ;
        c.say();
        c.print();
        System.out.println(c.getInfo());
    }
}
