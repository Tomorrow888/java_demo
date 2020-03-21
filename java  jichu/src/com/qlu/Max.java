package com.qlu;

/**
 * @author jiajinshuo
 * @create 2019-12-20 19:44
 * 用三元运算符获取三个数中最大的数
 */
public class Max {

    public static void main(String[] args) {

        int a = 12;
        int b = 78;
        int c = 6;

        int max1 = (a > b) ? a : b;
        int max2 = (max1 > c)? max1 : c ;
        System.out.println(max2);
    }
}
