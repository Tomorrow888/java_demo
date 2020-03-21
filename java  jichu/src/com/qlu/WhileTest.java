package com.qlu;

/**
 * @author jiajinshuo
 * @create 2019-12-21 14:01
 */
public class WhileTest {

    public static void main(String[] args) {

        int i = 1;
        while(i < 100){
            if(i % 2 == 0){
                System.out.println(i+"\t");
            }
            i++;//这个条件不能放到if里面，因为有可能执行不到
        }
    }
}
