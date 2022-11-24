/**
 * @author qjl
 * @create 2022-11-24 20:59
 */
public abstract class SoyaMilk {
    //模板方法，做成final，不让子类去实现
    final void make(){
        select();
        addCondiments();
        soak();
        beat();

    }
    void select(){
        System.out.println("第一步：选择新鲜的材料");
    }
    //抽象方法，使用子类去实现，选择不同的配料
    abstract void addCondiments();

    //浸泡
    void soak(){
        System.out.println("第三步：黄豆和配料需要浸泡");
    }
    void beat(){
        System.out.println("第四步：黄豆和配料去制作豆浆");
    }
}
