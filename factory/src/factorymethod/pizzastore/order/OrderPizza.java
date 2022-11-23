package factorymethod.pizzastore.order;
import factorymethod.pizzastore.pizza.Pizza;
import static Util_factory.Utils.getType;

/**
 * @author qjl
 * @create 2022-11-23 16:51
 */
public abstract class OrderPizza {
    //定义抽象方法，让各个工厂子类去实现
    abstract Pizza creatPizza(String orderType);
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            pizza = creatPizza(orderType);
            if (pizza != null) {
                showPizza(pizza);
            }else {
                break;
            }

        }while (true);
    }

//    SimpleFactory simpleFactory;
//    Pizza pizza = null;
//    public void setFactory(SimpleFactory simpleFactory) {
//        String orderType = "";
//        this.simpleFactory = simpleFactory;
//        do {
//            orderType = getType();
//            Pizza pizza = this.simpleFactory.creatPizza(orderType);
//            if(pizza !=null) {
//                showPizza(pizza);
//            }else {
//                System.out.println("披萨订购失败");
//                break;
//            }
//        }while (true);
//    }

    //动态获取客户希望获取的披萨种类

    public void showPizza(Pizza pizza){

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
