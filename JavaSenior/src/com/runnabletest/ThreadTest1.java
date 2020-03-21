package com.runnabletest;

/**
 * @author jiajinshuo
 * @create 2020-01-03 20:35
 */
class MThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            int j = 2;
            while(i % j != 0){
                j++;
            }
            if(i ==j ){
                System.out.println(Thread.currentThread().getName()+"\t"+i);
            }
        }
    }
}
public class ThreadTest1 {
    public static void main(String[] args) {

        MThread t1 = new MThread();
        //将对象作为参数，传入Thread类的构造器中，通过Thread类的对象调用start()
//        new Thread(t1).start();//谁start(),线程就是谁，不是t1
//        new Thread(t1).setName("线程一");
//        new Thread(t1).start();//再创建一个线程
        Thread thread1 = new Thread(t1);
        thread1.setName("线程一");
        thread1.start();
        Thread thread2 = new Thread(t1);
        thread2.setName("线程二");
        thread2.start();
    }
}
