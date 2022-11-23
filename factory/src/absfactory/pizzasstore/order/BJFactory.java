package absfactory.pizzasstore.order;

import absfactory.pizzasstore.pizza.BJCheesePizza;
import absfactory.pizzasstore.pizza.BJPepperPizza;
import absfactory.pizzasstore.pizza.Pizza;

/**
 * @author qjl
 * @create 2022-11-23 20:21
 */
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")) {
            pizza = new BJPepperPizza() ;
        }
        return pizza;
    }
}
