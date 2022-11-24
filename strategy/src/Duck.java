/**
 * @author qjl
 * @create 2022-11-24 11:20
 */
public abstract class Duck {
    public Duck() {
    }
    //显示duck的信息
    public abstract void display();
    public void quack(){
        System.out.println("Quack。。。。。。");
    }
    public void swim(){
        System.out.println("Swim。。。。。。。");
    }
    public void fly(){
        System.out.println("Fly。。。。。。。");
    }
}
