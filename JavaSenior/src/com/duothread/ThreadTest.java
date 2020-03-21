package com.duothread;

/**
 * @author jiajinshuo
 * @create 2020-01-03 17:09
 */
public class ThreadTest {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();
        MyThread myThread1 = new MyThread();
        myThread1.start();
    }
}
class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+"\t"+i);
            }

        }
    }
}
