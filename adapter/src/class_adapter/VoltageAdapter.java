package class_adapter;

/**
 * @author qjl
 * @create 2022-11-25 10:43
 */
//适配器继承被适配器的类
public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        int src = output220V();
        int dst = src / 44;
        return dst;
    }
}
