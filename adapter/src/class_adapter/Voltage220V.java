package class_adapter;

/**
 * @author qjl
 * @create 2022-11-25 10:40
 */
public class Voltage220V {
    public int output220V(){
        int src = 220;
        System.out.println("输出电压是"+src+"V");
        return src;
    }
}
