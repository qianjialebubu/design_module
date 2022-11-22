package proxy_dynamic;

/**
 * @author qjl
 * @create 2022-11-21 15:56
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("授课中。。。。。。");
    }

    @Override
    public void meetings(String name) {
        System.out.println(name+"开会中。。。。。。");
    }
}
