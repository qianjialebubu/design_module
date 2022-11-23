package absfactory.pizzasstore.order;

import absfactory.pizzasstore.pizza.Pizza;

import static Util_factory.Utils.getType;

/**
 * @author qjl
 * @create 2022-11-23 20:27
 */
public class OrderFactory {
    AbsFactory factory;
    public OrderFactory(AbsFactory factory) {
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory) {
        Pizza pizza = null;
        String orderType = "";
        this.factory = factory;
        do {
            orderType = getType();
            pizza = factory.createPizza(orderType);
            if (pizza != null) {
                showPizza(pizza);
            }else {break;}
        }while (true);

    }
    public void showPizza(Pizza pizza){

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
