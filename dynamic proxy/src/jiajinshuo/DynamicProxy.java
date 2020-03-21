package jiajinshuo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author jiajinshuo
 * @create 2020-03-04 22:00
 */
interface Human{
    String getBelief();
    void eat(String food);
}
//被代理类
class SuperMan implements Human{

    @Override
    public String getBelief() {
        return "i believe i can fly";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃"+food);

    }
}
class methodUtils{
    public void method1(){
        System.out.println("通用方法一");
    }
    public void method2(){
        System.out.println("通用方法二");
    }

}
class ProxyInstance{

    static thisInvocationHandle handle = new thisInvocationHandle();
    public static Object getProxyInstance(Object obj){//被代理对象

        handle.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handle);
    }
}

class thisInvocationHandle implements InvocationHandler{

    private Object obj;
    public void bind(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        methodUtils methodUtils = new methodUtils();
        methodUtils.method1();
        Object invoke = method.invoke(obj, args);
        methodUtils.method2();
        return invoke;
    }
}
public class DynamicProxy {
    public static void main(String[] args) {
        SuperMan sm = new SuperMan();
        //如果不强转，不能调用方法
        Human pi = (Human) ProxyInstance.getProxyInstance(sm);
        pi.eat("香蕉");
    }
}
