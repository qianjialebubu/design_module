package inversion;

/**
 * @author qjl
 * @create 2022-11-21 10:38
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());

    }
}
class Email {
    public String getInfo() {
        return "Email Hello World!";
    }
}
//方法一：此时receive依赖Email，即抽象依赖细节。
class Person {
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
//方法二：使用依赖倒转