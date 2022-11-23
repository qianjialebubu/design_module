package absfactory.pizzasstore.order;

import static Util_factory.Utils.getLoc;

/**
 * @author qjl
 * @create 2022-11-23 20:26
 */
public class PizzaStore {
    public static void main(String[] args) {
        if (getLoc().equals("bj")){
            new OrderFactory(new BJFactory());
        }else if (getLoc().equals("ld")){
            new OrderFactory(new LDFactory());
        }
    }
}
