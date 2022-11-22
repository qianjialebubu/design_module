package proxy_dynamic;

/**
 * @author qjl
 * @create 2022-11-21 16:15
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao target = new TeacherDao();
        //内存中生成了代理对象，使用代理对象进行调用目标对象的方法
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        proxyInstance.teach();
        proxyInstance.meetings("TOM");
    }
}
