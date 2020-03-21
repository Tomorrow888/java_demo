package com.array;

/**
 * @author jiajinshuo
 * @create 2019-12-26 18:00
 * 数组的初始化
 */
public class ArrayIni {
    public static void main(String[] args) {

        String[] str = new String[5];
        System.out.println(str[0]); //null
        System.out.println(str);//[Ljava.lang.String;@1b6d3586
        int[] ints = new int[5];
        System.out.println(ints[0]);//0
        System.out.println(ints);//[I@4554617c

        char[] ch = new char[]{'a','b'};
        //api中是对char型数组的遍历
        System.out.println(ch);//ab


    }
}
