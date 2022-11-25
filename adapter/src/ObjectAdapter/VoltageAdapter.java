package ObjectAdapter;

/**
 * @author qjl
 * @create 2022-11-25 10:43
 */
//适配器继承被适配器的类
public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        super();
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if(null != voltage220V){
            int src = voltage220V.output220V();
            dst = src /44;
            System.out.println("适配完成");
        }
        return dst;

    }
}
