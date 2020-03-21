package com.qlu;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author jiajinshuo
 * @create 2019-12-19 16:54
 */
//动态代理
interface Human{

        String getBelief();
        void eat(String food);
}
//被代理类
class SuperMan implements Human{

    @Override
    public String getBelief() {
        return "I believe i can fly";
    }

    @Override
    public void eat(String food) {
        System.out.println("你喜欢吃"+food);
    }
}

class HumanUtils{
    public void method1(){
        System.out.println("通用方法一=====================");
    }
    public void method2(){
        System.out.println("通用方法二=====================");
    }
}

class ProxyFactory{
    //调用此方法返回一个代理类对象
    public static Object getProxyInstance(Object obj){//obj被代理类对象
        MyInvocationHandler handler = new MyInvocationHandler();
        handler.bind(obj);
        //参数1，obj是哪个加载器加载的我和你一样。参数2，代理类和被代理类要实现同样的接口。参数3，InvocationHandler的实例
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handler);

    }
}

class MyInvocationHandler implements InvocationHandler{
    //被代理类的对象
    private Object obj;
    public void bind(Object obj){
        this.obj = obj;
    }
    //当我们通过代理类的对象调用方法a时，就会动态的调用invoke（）。
    // 参数1，代理类对象，参数2，代理类调用的方法 参数3，被代理类同名方法的参数
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        HumanUtils hu = new HumanUtils();
        hu.method1();
        //将被代理类要执行的方法功能声明在invoke（）中。method就是getBelief。当method为eat()时，args就是屎
       Object returnValue =  method.invoke(obj,args);
        hu.method2();
       return returnValue;
    }
}

public class ProxyTest {

    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        //proxyInstance的对象
        Human proxyInstance = (Human)ProxyFactory.getProxyInstance(superMan);
        String belief = proxyInstance.getBelief();//动态的调用了被代理类的方法
        System.out.println(belief);
        proxyInstance.eat("屎");
        //当通过代理类的对象调用这两个方法的时候，执行的时候是被代理类同名方法的调用
    }
}
