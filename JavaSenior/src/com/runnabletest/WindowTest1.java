package com.runnabletest;

/**
 * @author jiajinshuo
 * @create 2020-01-03 21:01
 * 通过实现Runnable接口的方式，多窗口卖票
 * 使用代码块实现线程安全
 */
class Window1 implements Runnable{

    private int tickets = 100;
    //Object obj = new Object();
    @Override
    public void run() {
        synchronized(this) {//不能用匿名对象，因为要共享同一把锁
            while (true) {
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "\t" + tickets);
                    tickets--;
                } else {
                    break;
                }
            }
        }


    }
}
public class WindowTest1 {
    public static void main(String[] args) {

        Window1 w1 = new Window1();//共用100张票，因为只创建了一个对象，放到了三个构造器中

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);

        t1.setName("窗口1");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();

    }
}
