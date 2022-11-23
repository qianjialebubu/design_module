package absfactory.pizzasstore.pizza;

/**
 * @author qjl
 * @create 2022-11-23 19:29
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("准备BJCheesePizza的原材料");
    }
}
