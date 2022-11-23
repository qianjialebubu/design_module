package simplefactory.pizzastore.pizza;

/**
 * @author qjl
 * @create 2022-11-23 18:30
 */
public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("准备PepperPizza的原材料");
    }
}
