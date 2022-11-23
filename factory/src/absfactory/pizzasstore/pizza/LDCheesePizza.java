package absfactory.pizzasstore.pizza;

/**
 * @author qjl
 * @create 2022-11-23 19:29
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备LDCheesePizza的原材料");
    }
}
