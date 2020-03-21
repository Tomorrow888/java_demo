package com.keyword;

/**
 * @author jiajinshuo
 * @create 2020-01-01 16:02
 * 单例模式的懒汉式实现
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        Order instance1= Order.getInstance();
        Order instance2 = Order.getInstance();
        System.out.println(instance1 == instance2);

    }

}
class Order{
    //1，私有化类的构造器
    private Order(){

    }
    //2，声明当前类对象，没有初始化
    private static Order instance = null;

    //3,返回当前类对象的方法
    public static Order getInstance(){
        if(instance ==  null){
            instance = new Order();
        }
        return instance;
    }

}