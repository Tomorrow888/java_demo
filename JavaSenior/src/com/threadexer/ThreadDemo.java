package com.threadexer;

/**
 * @author jiajinshuo
 * @create 2020-01-03 18:11
 * 创建两个线程，一个遍历100以内的偶数，一个遍历100以内的奇数
 * 思路 ：创建两个Thread类的子类
 */
public class ThreadDemo {
    public static void main(String[] args) {

//        NewClass1 n1 = new NewClass1();
//        NewClass2 n2 = new NewClass2();
//        n1.start();
//        n2.start();或
//        new NewClass1().start();
//        new NewClass2().start(); 或
        //创建Thread类的匿名子类方式
        new Thread(){//new 的Thread的子类
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if(i % 2 == 0){
                        System.out.println(Thread.currentThread().getName()+"\t"+i);
                    }

                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if( i % 2 != 0){
                        System.out.println(Thread.currentThread().getName()+"\t"+i);
                    }

                }
            }
        }.start();
    }
}
//class NewClass1 extends Thread{
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            if(i % 2 == 0){
//                System.out.println(Thread.currentThread().getName()+"\t"+i);
//            }
//
//        }
//
//    }
//}
//class NewClass2 extends Thread{
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            if( i % 2 != 0){
//                System.out.println(Thread.currentThread().getName()+"\t"+i);
//            }
//
//        }
//    }
//}
