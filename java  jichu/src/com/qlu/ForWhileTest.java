package com.qlu;

import java.util.Scanner;

/**
 * @author jiajinshuo
 * @create 2019-12-21 14:24
 * 题目:
 * 从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，
 * 输入为0时结束程序。
 */
public class ForWhileTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int positiveNumber = 0;//记录正数的个数
        int negativeNumber = 0;//记录负数的个数

        while(true){

            int number = sc.nextInt();
            //判断number的正负
            if(number > 0){
                positiveNumber++;
            }else if(number < 0){
                negativeNumber++;
            }else{
                break;//一旦执行break跳出循环
            }
        }
        System.out.println("正数的个数为："+positiveNumber);
        System.out.println("负数的个数为："+negativeNumber);
    }
}
