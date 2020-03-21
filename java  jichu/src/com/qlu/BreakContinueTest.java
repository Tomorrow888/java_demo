package com.qlu;

import java.awt.*;

/**
 * @author jiajinshuo
 * @create 2019-12-21 16:28
 * breaK和continue关键字的使用
 * continue：结束当次循环
 * 二者后面都不能有执行语句
 */
public class BreakContinueTest {

    public static void main(String[] args) {

        for(int i = 1;i<=10;i++){
            if(i % 4 == 0){
               // break; 123  默认跳出包裹关键字最近的循环
                continue;//1	2	3	5	6	7	9	10
            }
            System.out.print(i+"\t");
        }
        System.out.println();

        label:for(int i = 1;i<=4;i++){
            for(int j = 1;j <= 10;j++){
                if(j % 4 == 0){
                   // break ;
                    //continue ;
                   // break label;//结束指定标识的一层循环结构 1 2 3
                    continue label;//1	2	3	1	2	3	1	2	3	1	2	3
                }
                System.out.print(j+"\t");
            }
        }

    }
}
