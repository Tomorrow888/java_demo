package com.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jiajinshuo
 * @create 2020-01-04 17:49
 */
class Window implements Runnable{

    private int tickets = 100;
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            lock.lock();//调用锁定方法lock()
            try {
                if(tickets > 0){
                    System.out.println(tickets);
                    tickets--;
                }else {
                    break;
                }
            } finally {
                lock.unlock();//解除锁定

            }
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
