package com.test;

import java.util.Scanner;

/**
 * @author jiajinshuo
 * @create 2020-02-20 16:15
 */
public class ArrayExer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的人数");

        int num = scanner.nextInt();
        int[] scores = new int[num];
        System.out.println("请输入"+num+"个学生成绩");

        int maxScore = 0;
        for (int i = 0; i <scores.length ; i++) {
            scores[i]=scanner.nextInt();

            if(scores[i]>maxScore){
                maxScore = scores[i];
            }

        }

        for (int i = 0; i < scores.length; i++) {
            if(scores[i] >90){
                System.out.println("优秀");
            }else if(scores[i] > 70 && scores[i] <=90){
                System.out.println("良好");
            }else {
                System.out.println("不及格");
            }

        }
    }
}
