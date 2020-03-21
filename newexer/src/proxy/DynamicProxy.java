package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author jiajinshuo
 * @create 2020-03-05 10:03
 */
interface Star{
    void sing(String song);
}
//被代理类
class RealStar implements Star{

    @Override
    public void sing(String song) {
        System.out.println("明星唱一首"+song);
    }
}
class ProxyFactory{
    static MyInvocationHandler myih = new MyInvocationHandler();
    public static Object getProxyInstance(Object obj){
        myih.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),myih);
    }
}
class MyInvocationHandler implements InvocationHandler{

    private Object obj;
    public void bind(Object obj){
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(obj, args);
        return invoke;
    }
}
public class DynamicProxy {
    public static void main(String[] args) {

        RealStar rs = new RealStar();
        Star pi = (Star) ProxyFactory.getProxyInstance(rs);
        pi.sing("搁浅");

    }
}
