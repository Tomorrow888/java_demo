package com.keyword;

/**
 * @author jiajinshuo
 * @create 2020-01-01 15:48
 * 单例模式的饿汉式的实现
 */
public class SingletonTest1 {
    public static void main(String[] args) {

        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank1 == bank2);
    }
}
class Bank{

    //私有化构造器
    private Bank(){

    }
    //内部创建类的对象。属性值就是对象
    private static Bank instance = new Bank();
    //提供公共的静态方法返回类的对象
    public static Bank getInstance(){
        return instance; //因为静态的方法里面只能调静态的结构，所以instance也必须是静态的
    }

}