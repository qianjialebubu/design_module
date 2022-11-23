package simplefactory.pizzastore.order;

import simplefactory.pizzastore.pizza.CheesePizza;
import simplefactory.pizzastore.pizza.GreekPizza;
import simplefactory.pizzastore.pizza.PepperPizza;
import simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.PublicKey;

/**
 * @author qjl
 * @create 2022-11-23 16:51
 */
public class OrderPizza {
    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    /*
        public OrderPizza() {
            Pizza pizza = null;
            String orderType;
            do {
                orderType = getType();
                if (orderType.equals("greek")) {
                    pizza = new GreekPizza();
                    showPizza(orderType,pizza);
                }else if (orderType.equals("cheese")){
                    pizza = new CheesePizza();
                    showPizza(orderType,pizza);
                }else if (orderType.equals("pepper")){
                    pizza = new PepperPizza();
                    showPizza(orderType,pizza);
                }
                else {
                    System.out.println("未知披萨");
                    break;
                }

            }while (true);

        }
         */
    SimpleFactory simpleFactory;
    Pizza pizza = null;
    public void setFactory(SimpleFactory simpleFactory) {
        String orderType = "";
        this.simpleFactory = simpleFactory;
        do {
            orderType = getType();
            Pizza pizza = this.simpleFactory.creatPizza(orderType);
            if(pizza !=null) {
                showPizza(pizza);
            }else {
                System.out.println("披萨订购失败");
                break;
            }
        }while (true);
    }

    //动态获取客户希望获取的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
    public void showPizza(Pizza pizza){

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
