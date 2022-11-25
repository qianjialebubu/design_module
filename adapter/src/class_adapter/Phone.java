package class_adapter;

/**
 * @author qjl
 * @create 2022-11-25 10:46
 */
public class Phone implements iPhone{
    @Override
    public void charging(IVoltage5V iVoltage5V) {
        if(iVoltage5V.output5V() == 5){
            System.out.println("当前电压是5v，可以充电");
        }else {
            System.out.println("当前电压不是5v，不可以进行充电");
        }
    }
}
