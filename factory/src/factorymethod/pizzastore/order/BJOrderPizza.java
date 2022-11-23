package factorymethod.pizzastore.order;
import factorymethod.pizzastore.pizza.BJCheesePizza;
import factorymethod.pizzastore.pizza.BJPepperPizza;
import factorymethod.pizzastore.pizza.Pizza;


/**
 * @author qjl
 * @create 2022-11-23 19:41
 */
public class BJOrderPizza extends OrderPizza{

    @Override
    Pizza creatPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
