package simplefactory.pizzastore.order;

/**
 * @author qjl
 * @create 2022-11-23 16:58
 * 相当于一个客户端，发出披萨的订购任务
 */
public class PizzaStore {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        new OrderPizza(simpleFactory);
        System.out.println("退出程序");
    }
}
