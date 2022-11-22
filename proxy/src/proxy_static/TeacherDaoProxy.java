package proxy_static;

/**
 * @author qjl
 * @create 2022-11-21 15:40
 */
public class TeacherDaoProxy implements ITeacherDao{
    private ITeacherDao iTeacherDao;

    public TeacherDaoProxy(ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }

    @Override
    public void teacher() {
        System.out.println("代理开始");
        iTeacherDao.teacher();
        System.out.println("代理结束");
    }
}
