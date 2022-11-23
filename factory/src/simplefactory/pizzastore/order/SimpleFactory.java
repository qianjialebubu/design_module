package simplefactory.pizzastore.order;

import simplefactory.pizzastore.pizza.*;

/**
 * @author qjl
 * @create 2022-11-23 18:38
 */
public class SimpleFactory {
    //简单工厂模式
    //根据orderType返回pizza实例
    public Pizza creatPizza(String orderType){
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if (orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }else if (orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }else if (orderType.equals("china")){
            pizza = new ChinaPizza();
            pizza.setName("中式披萨");
        }
        return pizza;
    }
}
