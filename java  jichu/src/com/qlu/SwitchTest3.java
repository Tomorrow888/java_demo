package com.qlu;

import java.util.Scanner;

/**
 * @author jiajinshuo
 * @create 2019-12-21 11:51
 * 从键盘分别输入年、月、日，判断这一天是当年的第几天
 * 注:判断一年是否是闰年的标准:
 * 1)可以被4整除，但不可被100整除
 * 或
 * 2)可以被400整除
 */
public class SwitchTest3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年");
        int year = sc.nextInt();
        System.out.println("请输入月");
        int month = sc.nextInt();
        System.out.println("请输入天:");
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
            case 3 :
                    if((year % 4 ==0 && year % 100 != 0) || year % 400 ==0){
                        sumDays+=29;
                    }else{
                        sumDays+=28;
                    }
            case 2 :sumDays += 31;
            case 1 :sumDays += day;
        }
        System.out.println(year+"年的"+month+"月"+day+"日是这一年的第"+sumDays+"天");

    }
}
