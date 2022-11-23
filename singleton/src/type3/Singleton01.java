package type3;

/**
 * @author qjl
 * @create 2022-11-22 11:43
 * 懒汉式：线程不安全的写法，在调用getinstance()时才会进行创建对象
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
// 1、私有化构造方法，
// 3、提供getinstance方法返回（公共的静态法方法)，只有在初次加载时才会创建类的对象
class Singleton{
    private Singleton() {}
    public static Singleton singleton;
    public static Singleton getInstance() {
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}