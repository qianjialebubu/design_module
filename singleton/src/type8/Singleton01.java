package type8;

/**
 * @author qjl
 * @create 2022-11-22 11:43
 * 懒汉式：使用静态内部类
 */
public class Singleton01 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        instance.sayOk();
        Runtime runtime = Runtime.getRuntime();
//        Runtime runtime1 = Runtime.getRuntime();
//        System.out.println(runtime.hashCode());
//        System.out.println(runtime1.hashCode());
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}
//使用枚举方法实现单例模式
// 1、私有化构造方法，3、提供getinstance方法返回（公共的静态法方法，线程安全)
enum Singleton{
    INSTANCE;
    public void sayOk(){
        System.out.println("ok");
    }

}