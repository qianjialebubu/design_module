package improve;

/**
 * @author qjl
 * @create 2022-11-24 21:27
 */
public class PureSoyaMilk extends SoyaMilk{
    @Override
    void addCondiments() {
        //空实现
    }
    boolean customerWantCondiments(){
        return false;
    }
}
