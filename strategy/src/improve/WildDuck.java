package improve;

import improve.behavior.FlyBehavior;
import improve.behavior.GreatFlyBehavior;

/**
 * @author qjl
 * @create 2022-11-24 11:24
 */
public class WildDuck extends Duck {

    public WildDuck() {
        flyBehavior = new GreatFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("WildDuck");
    }

}
