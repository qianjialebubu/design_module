package InterfactAdapter;

/**
 * @author qjl
 * @create 2022-11-25 11:33
 */
public class Client {
    public static void main(String[] args) {
        new AbsAdapter(){
            //只需要覆盖我们需要的方法即可
            public void first() {
                System.out.println("First");
            }
        }.first();

    }
}
