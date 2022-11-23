package factorymethod.pizzastore.pizza;

/**
 * @author qjl
 * @create 2022-11-23 19:29
 */
public class BJPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("准备BJPepperPizza的原材料");
    }
}
