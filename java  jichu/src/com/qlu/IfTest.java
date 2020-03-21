package com.qlu;

import java.util.Scanner;

/**
 * @author jiajinshuo
 * @create 2019-12-20 20:21
 */
public class IfTest {
    public static void main(String[] args) {

        System.out.println("请输入成绩:");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        //范围小的要在范围大的上面
        if(score == 100){
            System.out.println("一辆bmw");
        }else if(score >80 && score <=99){
            System.out.println("iphone一部");
        }else if(score>=60&&score<=80){
            System.out.println("一部ipad");
        }else {
            System.out.println("什么也没有");
        }
    }
}
