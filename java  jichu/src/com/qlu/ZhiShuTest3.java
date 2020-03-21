package com.qlu;

import java.awt.*;

/**
 * @author jiajinshuo
 * @create 2019-12-21 17:29
 * 输出质数另一种方法
 */
public class ZhiShuTest3 {

    public static void main(String[] args) {

        label:for(int i = 2;i<=100;i++){
            for(int j =2;j<=Math.sqrt(i);j++){
                if(i % j == 0){
                    continue label;//不用“进屋穿马甲”，不符合规定，立马消失，换另一个i
                }
            }
            System.out.println(i+" ");
        }


    }
}
