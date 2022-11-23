package absfactory.pizzasstore.order;

import absfactory.pizzasstore.pizza.LDCheesePizza;
import absfactory.pizzasstore.pizza.LDPepperPizza;
import absfactory.pizzasstore.pizza.Pizza;

/**
 * @author qjl
 * @create 2022-11-23 20:24
 */
public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
