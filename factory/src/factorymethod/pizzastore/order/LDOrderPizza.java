package factorymethod.pizzastore.order;

import factorymethod.pizzastore.pizza.LDCheesePizza;
import factorymethod.pizzastore.pizza.LDPepperPizza;
import factorymethod.pizzastore.pizza.Pizza;

/**
 * @author qjl
 * @create 2022-11-23 19:41
 */
public class LDOrderPizza extends OrderPizza{
    Pizza pizza = null;
    @Override
    Pizza creatPizza(String orderType) {
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
