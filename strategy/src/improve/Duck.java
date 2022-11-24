package improve;

import improve.behavior.FlyBehavior;

/**
 * @author qjl
 * @create 2022-11-24 11:20
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
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
        if(flyBehavior != null){
            flyBehavior.fly();
        }
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
