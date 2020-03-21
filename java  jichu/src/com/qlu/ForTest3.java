package com.qlu;

import java.util.Scanner;

/**
 * @author jiajinshuo
 * @create 2019-12-21 13:43
 * 三位数水仙花数：
 * 153 = 1*1*1 + 5*5*5 + 3*3*3
 */
public class ForTest3 {
    //打印出三位数所有的水仙花数
    public static void main(String[] args) {

        for(int i = 100 ;i < 1000;i++){
            int a = i / 100;
            int b = i % 100 /10;
            int c = i % 10;
            if( i == a*a*a + b*b*b + c*c*c){
                System.out.println(i+"\t");
            }
        }
    }
}
