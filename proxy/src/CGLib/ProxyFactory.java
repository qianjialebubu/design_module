package CGLib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author qjl
 * @create 2022-11-21 16:48
 */
public class ProxyFactory implements MethodInterceptor {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }
    //返回target的代理对象
    public Object getProxyInstance(){
        //工具类，设置父类，回调函数，设置子类
        Enhancer en = new Enhancer();
        en.setSuperclass(target.getClass());
        en.setCallback(this);
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLib代理模式开始");
        Object o1 = method.invoke(target, objects);
        System.out.println("CGLib代理模式结束");
        return o1;
    }
}
