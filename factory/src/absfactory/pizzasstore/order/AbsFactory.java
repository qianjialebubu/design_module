package absfactory.pizzasstore.order;

import absfactory.pizzasstore.pizza.Pizza;

/**
 * @author qjl
 * @create 2022-11-23 20:19
 */
public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
