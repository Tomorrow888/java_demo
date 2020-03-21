package com.tongbu;

/**
 * @author jiajinshuo
 * @create 2020-01-04 15:54
 * 使用同步方法实现线程同步
 * 实现Runnable接口
 */
class Window implements Runnable{

    int tickets = 100;
    @Override
    public void run() {
        while(true){
            show();

        }
    }
    private synchronized void show(){
        if(tickets > 0){
            System.out.println(tickets);
            tickets--;
        }
    }
}
public class WindowTest3 {
    public static void main(String[] args) {

        Window w1 = new Window();

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);

        t1.start();
        t2.start();
        t3.start();
    }
}
