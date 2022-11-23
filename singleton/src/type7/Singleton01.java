package type7;

/**
 * @author qjl
 * @create 2022-11-22 11:43
 * 懒汉式：使用静态内部类
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
    //静态内部类的静态属性
    public static class SingletonInstance{
        public static final Singleton INSTANCE = new Singleton();
    }

    public static  Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}