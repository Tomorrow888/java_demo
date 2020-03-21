package com.tongbu;

/**
 * @author jiajinshuo
 * @create 2020-01-04 16:09
 * 使用同步方法实现线程同步
 * 继承Thread类
 */
class Windows extends Thread{

    private static int tickets = 100;

    @Override
    public void run() {
        while (true){
            show();
        }

    }
    public static synchronized void show(){//此时的锁为Window.class。this为3个
        if(tickets > 0){
            System.out.println(tickets);
            tickets--;
        }
    }
}
public class WindowTest4 {
    public static void main(String[] args) {

        new Windows().start();
        new Windows().start();
        new Windows().start();

    }
}
