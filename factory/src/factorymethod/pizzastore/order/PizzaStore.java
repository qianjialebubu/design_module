package factorymethod.pizzastore.order;

import Util_factory.Utils;

/**
 * @author qjl
 * @create 2022-11-23 19:57
 */
public class PizzaStore {
    public static void main(String[] args) {
        if (Utils.getLoc().equals("bj")) {
            new BJOrderPizza();
        }else if (Utils.getLoc().equals("ld")){
            new LDOrderPizza();
        }

    }

}
