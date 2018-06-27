package DesignPattern.Examples.FactoryMethod.IO;

/**
 * Created by Danny on 2018/6/27.
 */
public class IOFactory {
    public static <T extends IOHandler> T getIOHandler(Class<T> clz){
        IOHandler handler = null ;
        try {
            handler = (IOHandler) Class.forName(clz.getName()).newInstance();
        } catch (Exception e){
            e.printStackTrace();
        }
        return (T) handler;
    }
}
