package DesignPattern.CreatingPattern.PrototypePattern.Prototype;

/**
 * Created by Danny on 2018/6/26.
 */
public class Prototype implements Cloneable {
    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() {
        try {
            return super.clone() ;
        } catch (Exception e){
            e.printStackTrace();
            return  null ;
        }
    }
}
