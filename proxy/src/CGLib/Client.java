package CGLib;

/**
 * @author qjl
 * @create 2022-11-21 17:05
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
        proxyInstance.teacher();
        String name = proxyInstance.meeting("TOM");
        System.out.println(name);

    }
}
