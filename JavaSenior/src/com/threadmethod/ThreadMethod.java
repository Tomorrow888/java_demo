package com.threadmethod;

/**
 * @author jiajinshuo
 * @create 2020-01-03 18:46
 * 测试Thread类中常用方法
 */
public class ThreadMethod {
    public static void main(String[] args) {

        MyThread t1 = new MyThread("线程一");
        t1.setPriority(Thread.MAX_PRIORITY);
        //t1.setName("线程一");给线程两种命名方式
        t1.start();
//给主线程命名
        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

        for (int i = 2; i < 100; i++) {
            int j = 2;
            while( i % j != 0){
                j++;
            }
            if(i ==j ){
                System.out.println(Thread.currentThread().getName()+"\t"+Thread.currentThread().getPriority()+"\t"+i);
            }
//            if(i == 13){
//                try {
//                    t1.join();//t1对象的方法，所以要让线程一执行完
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }

        }
        System.out.println(t1.isAlive());//判断线程是否存活

    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
//                try {
//                    sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }//因为在Thread类里面就不用写Current...
                System.out.println(getName()+"\t"+getPriority()+"\t"+i);
            }
            if(i % 20 == 0){
                yield();//释放cpu执行权
            }


        }

    }
    public  MyThread(String name){
        super(name);
    }
}
