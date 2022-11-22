package CGLib;

/**
 * @author qjl
 * @create 2022-11-21 16:46
 */
public class TeacherDao {
    public void teacher(){
        System.out.println("CGLib代理，授课中。。。。。。");
    }
    public String meeting(String name){
        System.out.println(name+"开会。。。。。。");
        return name;
    }
}
