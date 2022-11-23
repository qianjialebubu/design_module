package factorymethod.pizzastore.pizza;

/**
 * @author qjl
 * @create 2022-11-23 19:29
 */
public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("准备BJCheesePizza的原材料");
    }
}
