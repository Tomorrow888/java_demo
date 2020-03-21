package com.qlu;

import java.util.Scanner;

/**
 * @author jiajinshuo
 * @create 2019-12-20 22:48
 * 编写程序，从键盘上输入2019年的month和day，要求通过程序输出输入的日期为
 * 2019年的第几天
 */
public class SwitchTest2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("请输入天");
        int day = sc.nextInt();

        int sumDays = 0;

        switch(month){

            case 12:sumDays += 30;
            case 11:sumDays += 31;
            case 10:sumDays += 30;
            case 9 :sumDays += 31;
            case 8 :sumDays += 31;
            case 7 :sumDays += 30;
            case 6 :sumDays += 31;
            case 5 :sumDays += 30;
            case 4 :sumDays += 31;
            case 3 :sumDays += 28;
            case 2 :sumDays += 31;
            case 1 :sumDays += day;
        }
        System.out.println("2019年的"+month+"月"+day+"日是这一年的第"+sumDays+"天");

    }
}
