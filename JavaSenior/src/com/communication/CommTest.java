package com.communication;

/**
 * @author jiajinshuo
 * @create 2020-01-04 18:45
 * 使用两个线程打印 1-100。线程1, 线程2 交替打印
 */
class Number implements Runnable{

    private int num = 1;
    @Override
    public void run() {
        while (true){
            synchronized (this) {
                notify();
                if(num <= 100){
                    System.out.println(Thread.currentThread().getName()+"\t"+num);
                    num++;
                    try {
                        wait();//使得调用红wait()的线程进入阻塞状态。就不走了！
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    break;
                }
            }
        }


    }
}
public class CommTest {
    public static void main(String[] args) {

        Number n1 = new Number();

        Thread t1 = new Thread(n1);
        Thread t2 = new Thread(n1);


        t1.start();
        t2.start();
    }
}
