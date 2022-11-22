package inversion.Pro;

/**
 * @author qjl
 * @create 2022-11-21 11:07
 * 使用方法二解除抽象依赖细节，即使用接口进行解耦合
 */
public class DependecyInversionPro {
    public static void main(String[] args) {
        Person person = new Person();
        person.getMessage(new Email());
        person.getMessage(new weiXin());

    }
}
interface IReceiver{
    public String receiverInfo();
}
//Email继承接口进行具体实现，细节。现在是抽象依赖接口，不依赖细节（具体的类）
class Email implements IReceiver{
    public String receiverInfo(){
        return "Email Hello World";
    }
}

class weiXin implements IReceiver{

    @Override
    public String receiverInfo() {
        return "WeiXin Hello World";
    }
}
//抽象依赖抽象接口，不依赖细节
class Person {
    public void getMessage(IReceiver receiver){
        System.out.println(receiver.receiverInfo());
    }
}
