package com.array;

/**
 * @author jiajinshuo
 * @create 2019-12-21 20:38
 * //遍历二维数组
 */
public class ArrayBianLi {

    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4},{9,8},{5,4}};
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
