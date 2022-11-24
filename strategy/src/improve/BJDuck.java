package improve;

import improve.behavior.BadFlyBehavior;
import improve.behavior.NoFlyBehavior;

/**
 * @author qjl
 * @create 2022-11-24 11:25
 */
public class BJDuck extends Duck {
    public BJDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("BJDuck");
    }

}
