package com.array;

/**
 * @author jiajinshuo
 * @create 2019-12-22 13:16
 * 打印10行杨辉三角
 */
public class Triangle {

    public static void main(String[] args) {

        //声明并初始化数组
        int[][] yangHui = new int[10][];
        //给数组的元素赋值
        for(int i = 0;i<yangHui.length;i++){
            yangHui[i] = new int[i+1];
            yangHui[i][0] = yangHui[i][i] = 1;
           // if(i>1){
                for(int j = 1;j<yangHui[i].length-1;j++){
                    yangHui[i][j] = yangHui[i-1][j]+yangHui[i-1][j-1];
                }
           // }

        }
        for(int i = 0;i<yangHui.length;i++){
            for(int j = 0;j<yangHui[i].length;j++){
                System.out.print(yangHui[i][j]+" ");
            }
            System.out.println();
        }

    }
}
