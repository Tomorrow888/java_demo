package com.array;

import java.util.Scanner;

/**
 * @author jiajinshuo
 * @create 2019-12-21 19:47
 * 2.从键盘读入学生成绩，找出最高分，
 * 并输出学生成绩等级。
 * 成绩>=最高分-10 等级为'A'
 * 成绩>=最高分-20 等级为'B'’
 * 成绩>=最高分-30 等级为'C'
 * 其余等级为'D'
 */
public class ArrayDemo1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生人数");
        int num = sc.nextInt();

        int[] scores = new int[num];
        System.out.println("请输入"+num+"个学生成绩");
        int maxScore = 0;
        for(int i = 0;i<scores.length;i++){
            scores[i] = sc.nextInt();
            //获得数组中最大值
            if(maxScore <= scores[i]){
                maxScore = scores[i];
            }

        }

        char level;
        for(int i = 0;i < scores.length;i++){
            if(maxScore - scores[i] <= 10){
                level = 'A';
            }else if(maxScore - scores[i] <= 20){
                level = 'B';
            }else if(maxScore - scores[i] <= 30){
                level = 'C';
            }else {
                level = 'D';
            }
            System.out.println("student"+i+"score is "+scores[i]+",grade is"+level);




        }
    }
}
