package com.threadexer2;

/**
 * @author jiajinshuo
 * @create 2020-01-03 20:17
 * 创建三个窗口卖票，总票数100张
 * 使用代码块实现线程安全
 */
class Window extends Thread{

    private static  int tickets = 100;

    @Override
    public void run() {
        while (true){
            synchronized (Window.class) {
                if (tickets > 0) {//只是当前窗口票不是100，其它两个窗口还是100。每个对象100总共300
                    System.out.println(getName() + "票号为：" + tickets);
                    tickets--;
                } else {
                    break;
                }
            }
        }
    }
}

public class WindowTest {
    public static void main(String[] args) {

        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("窗口一");
        w2.setName("窗口二");
        w3.setName("窗口三");

        w1.start();
        w2.start();
        w3.start();
    }


}
