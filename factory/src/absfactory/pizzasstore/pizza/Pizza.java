package absfactory.pizzasstore.pizza;

/**
 * @author qjl
 * @create 2022-11-23 16:40
 * 抽象类，所有pizza的父类
 */
public abstract class Pizza {
    protected String name;
    public abstract void prepare();
    public void bake(){
        System.out.println(name + "baking......");
    }
    public void cut(){
        System.out.println(name + "cutting......");
    }
    public void box(){
        System.out.println(name + "box......");
    }
    public void setName(String name) {
        this.name = name;
    }
}
