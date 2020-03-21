package com.qlu;

/**
 * @author jiajinshuo
 * @create 2019-12-21 14:53
 * 内层循环结构遍历一遍，只相当于外层循环循环体执行了-次
 * 假设外层循环需要执行m次，内层循环需要执行n次。此时内层循环的循环体一共执行了m *
 * n次
 */
public class ForQianTao {

    public static void main(String[] args) {

        for(int i = 1;i< 5;i++){
            //每一次i+j都等于5，j控制每一行的个数
            for(int j = 1;j<= (5-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
