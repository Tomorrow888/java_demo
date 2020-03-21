package com.oop;

/**
 * @author jiajinshuo
 * @create 2019-12-27 19:53
 */
public class DebugTest {
    public static void main(String[] args) {

        int i = 10;
        int j = 20;
        System.out.println("i = "+i+" j = "+ j);
        DebugTest dt = new DebugTest();
        int max = dt.getMax(i, j);
        System.out.println("max = "+max);


    }
    private int getMax(int k,int m){
        int max = 0;
        if(k < m){
            max = m;
        }else{
            max = k;
        }
        return max;

    }
}
