package DesignPattern.CreatingPattern.SingletMode.Singleton;

/**
 * Created by Danny on 2018/6/26.
 * 相比于懒汉以及饿汉模式，静态内部类模式没有一个较为官方的名称，这只是我个人的称谓。但是却是许多人更为推荐的一种形式。
 　　顾名思义，这种模式使用了一个私有的静态内部类，来存储外部类的单例，这种静态内部类，一般称为 Holder。
 　　而利用静态内部类的特性，外部类的 getinstance() 方法，可以直接指向 Holder 持有的对象。
 考虑反射：
 　　由于在调用 SingletonHolder.instance 的时候，才会对单例进行初始化，而且通过反射，是不能从外部类获取内部类的属性的。
 　　所以这种形式，很好的避免了反射入侵。
 考虑多线程：
 　　由于静态内部类的特性，只有在其被第一次引用的时候才会被加载，所以可以保证其线程安全性。
 总结：
 　　优势：兼顾了懒汉模式的内存优化（使用时才初始化）以及饿汉模式的安全性（不会被反射入侵）。
 　　劣势：需要两个类去做到这一点，虽然不会创建静态内部类的对象，但是其 Class 对象还是会被创建，而且是属于永久带的对象。

 */
public class Singleton2 {
    /**
     * 创建一个内部类 去持有外部类的引用。
     */
    private static class SingletonHolder {
        private static Singleton2 instance = new Singleton2() ;
    }

    private Singleton2(){
        if (SingletonHolder.instance != null) {
            throw  new IllegalStateException() ;
        }
    }

    public static Singleton2 getInstance(){
        return SingletonHolder.instance ;
    }
}
