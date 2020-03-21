package com.array;

import java.util.Scanner;

/**
 * @author jiajinshuo
 * @create 2019-12-22 11:41
 */
public class ArrayDemo2 {

    public static void main(String[] args) {

       // System.out.println("请输入学生的个数");
        Scanner sc = new Scanner(System.in);
       // int num = sc.nextInt();

        int[] scores = new int[5];
       // System.out.println("请输入"+num+"个学生的成绩");
        for(int i = 0;i<scores.length;i++){
            scores[i] = sc.nextInt();
        }

        for(int i = 0;i<scores.length;i++){
            if(scores[i]>90){
                System.out.println("优秀");
            }else if(scores[i]>80&&scores[i]<90){
                System.out.println("良好");
            }else if(scores[i]>60&&scores[i]<80){
                System.out.println("标准");
            }else{
                System.out.println("不合格");

            }
        }



    }
}
