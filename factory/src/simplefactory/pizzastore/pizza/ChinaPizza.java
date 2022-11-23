package simplefactory.pizzastore.pizza;

/**
 * @author qjl
 * @create 2022-11-23 19:06
 */
public class ChinaPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("准备ChinaPizza的原材料");
    }
}
