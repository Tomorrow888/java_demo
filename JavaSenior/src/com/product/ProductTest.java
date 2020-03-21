package com.product;

/**
 * @author jiajinshuo
 * @create 2020-01-07 18:32
 * 生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处
 * 取走产品，店员一次只能持有固定数量的产品(比如:20），如果生产者试图
 * 生产更多的产品，店员会叫生产者停一下，如果店中有空位放产品了再通
 * 知生产者继续生产；如果店中没有产品了，店员会告诉消费者等一下，如
 * 果店中有产品了再通知消费者来取走产品。
 */
class Clerk{

    private int productCount = 0;

    //生产产品
    public synchronized void produceProduct() {
        if(productCount < 20){
            productCount++;
            System.out.println(Thread.currentThread().getName()+"正在生产第"+productCount+"产品");
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //消费产品
    public synchronized void consumeProduct() {
        if(productCount > 0){
            System.out.println(Thread.currentThread().getName()+"正在消费第"+productCount+"产品");
            productCount--;
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Producer extends Thread{//生产者

    private Clerk clerk;
    public Producer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("开始生产产品"+getName());
        while (true){
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }

    }
}
class Consumer extends Thread{//消费者
    private Clerk clerk;
    public Consumer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("开始消费产品"+getName());
        while (true){
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumeProduct();
        }

    }
}
public class ProductTest {
    public static void main(String[] args) {

        Clerk clerk = new Clerk();
        Producer p1 = new Producer(clerk);
        p1.setName("生产者");

        Consumer c1 = new Consumer(clerk);
        c1.setName("消费者");

        p1.start();
        c1.start();
    }
}
