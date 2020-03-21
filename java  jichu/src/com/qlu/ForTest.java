package com.qlu;

/**
 * @author jiajinshuo
 * @create 2019-12-21 12:38
 * 遍历100以内的偶数,每行打印
 */
public class ForTest {

    public static void main(String[] args) {

        int count = 0;
        for(int i = 1;i<=100;i++){
            if(i % 2 == 0){
                System.out.print(i+"\t");
                count++;
                if(count % 5 ==0){
                    System.out.println();
                }

            }
        }
    }
}
