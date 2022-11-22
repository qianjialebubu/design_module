package proxy_static;

/**
 * @author qjl
 * @create 2022-11-21 15:43
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        teacherDaoProxy.teacher();
    }
}
