package improve;

import improve.behavior.BadFlyBehavior;

/**
 * @author qjl
 * @create 2022-11-24 13:39
 */
public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();
        wildDuck.setFlyBehavior(new BadFlyBehavior());
        wildDuck.fly();
    }
}
