/**
 * @author qjl
 * @create 2022-11-24 21:17
 */
public class Client {
    public static void main(String[] args) {
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
    }
}
