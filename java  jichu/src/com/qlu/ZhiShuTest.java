package com.qlu;

/**
 * @author jiajinshuo
 * @create 2019-12-21 15:27
 * 打印1-100以内所有的质数，每五行输出
 * 质数：只能被1它本身整除的自然数
 * 最小的质数：2
 */
public class ZhiShuTest {

    public static void main(String[] args) {

        int count = 0;
        for(int i = 2;i<100;i++){
            int j = 2;
            while(i % j != 0){
                j++;
            }
            if(i == j){
                System.out.print(i+"\t");
                count++;
                if(count % 5 == 0){
                    System.out.println();
                }
            }
        }


    }
}
