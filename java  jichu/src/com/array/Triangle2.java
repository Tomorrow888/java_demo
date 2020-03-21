package com.array;

/**
 * @author jiajinshuo
 * @create 2019-12-22 15:39
 * 杨辉三角方法二
 */
public class Triangle2 {

    public static void main(String agrs[]) {
        int[][] a = new int[10][10];//如果后面的10不写，会空指针异常
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) {
                    a[i][j] = 1;
                } else {
//a[2][1] = a[1][0]+a[1][1]
//2 = 1+1
                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
