package com.array;

/**
 * @author jiajinshuo
 * @create 2019-12-22 12:57
 * 计算二维数组的和
 */
public class ArraySum {

    public static void main(String[] args) {

        int sum = 0;
        int[][] arr = {{3,4,8},{12,9},{7,0,6,4}};

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }

}
