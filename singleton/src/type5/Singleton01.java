package type5;

/**
 * @author qjl
 * @create 2022-11-22 11:43
 * 懒汉式：线程安全的使用synchronized保证线程的安全。但是效率低.
 * 使用synchronized，同步代码块
 */
public class Singleton01 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}
//饿汉式（静态变量）
// 1、私有化构造方法，3、提供getinstance方法返回（公共的静态法方法，线程安全)
class Singleton{
    private Singleton() {}
    public static Singleton singleton ;
    public static  Singleton getInstance() {
        if (singleton == null){
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}