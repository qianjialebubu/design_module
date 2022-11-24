package improve.behavior;

/**
 * @author qjl
 * @create 2022-11-24 13:06
 */
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不可飞行");
    }
}
