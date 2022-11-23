package simplefactory.pizzastore.pizza;

/**
 * @author qjl
 * @create 2022-11-23 16:47
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备GreekPizza的原材料");
    }
}
