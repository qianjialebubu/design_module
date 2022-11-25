package ObjectAdapter;

/**
 * @author qjl
 * @create 2022-11-25 10:50
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("===对象适配器模式===");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
