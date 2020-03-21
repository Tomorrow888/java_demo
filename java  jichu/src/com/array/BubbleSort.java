package com.array;

/**
 * @author jiajinshuo
 * @create 2019-12-25 12:00
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {23,6,5,-4,56,25,89,65,55};
        for(int i = 0;i<arr.length - 1;i++){
            for(int j = 0;j<arr.length - 1 - i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        /*for(int i : arr){
            System.out.print(arr[i]+"  ");//使用foreach 会数组越界异常，for就不会
        }*/
    }
}
