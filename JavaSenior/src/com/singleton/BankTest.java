package com.singleton;

/**
 * @author jiajinshuo
 * @create 2020-01-04 16:54
 * 把单例模式（懒汉式）改成线程安全
 */
public class BankTest {
}

class Bank{

    private Bank(){

    }
    private static Bank instance = null;
    public static Bank getInstance(){

        //方式二 ,外边的线程不用等了
        if(instance == null){

            if(instance == null){
                instance = new Bank();
            }
        }
        return instance;



//方式一
//        synchronized (Bank.class) {//效率低，其他线程进来啥也没干，就返回了以前的实例
//            if(instance == null){
//                instance = new Bank();
//            }
//            return instance;
//        }
    }
}