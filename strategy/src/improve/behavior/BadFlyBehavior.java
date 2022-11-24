package improve.behavior;

/**
 * @author qjl
 * @create 2022-11-24 13:10
 */
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞行技术差");
    }
}
