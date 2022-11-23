package simplefactory.pizzastore.pizza;

/**
 * @author qjl
 * @create 2022-11-23 16:45
 */
public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("准备CheesePizza的原材料");
    }
}
