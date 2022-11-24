/**
 * @author qjl
 * @create 2022-11-24 11:26
 */
public class ToyDuck extends Duck{
    @Override
    public void display() {
        System.out.println("ToyDuck");
    }
    //需要重写父类的所有的方法
    public void quack(){
        System.out.println("cannot quack。。。。。。");
    }
    public void swim(){
        System.out.println("cannot swim。。。。。。。");
    }
    public void fly(){
        System.out.println("cannot fly。。。。。。。");
    }
}
