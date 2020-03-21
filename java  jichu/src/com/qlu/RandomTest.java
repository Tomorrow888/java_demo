package com.qlu;

/**
 * @author jiajinshuo
 * @create 2019-12-20 21:45
 * 如何获取一个随机数 [10,99)
 * random()  [0,1)
 */
public class RandomTest {

    public static void main(String[] args) {
        //公式：[a,b]   (b -a +1) +a
        int num =  (int)(Math.random() * 90 + 10);
        System.out.println(num);
    }
}
