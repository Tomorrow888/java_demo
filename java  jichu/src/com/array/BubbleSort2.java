package com.array;

import java.util.Arrays;

/**
 * @author jiajinshuo
 * @create 2019-12-25 12:11
 * 冒泡排序
 */
public class BubbleSort2 {

    public void bubbleSort(int[] arr,Integer n){
        if(n<=1){//如果只有一个元素就不用排序了
            return;
        }

        for(int i = 0;i<arr.length - 1;i++){
            boolean isFlag = true;
            for(int j = 0;j< arr.length - 1 -i;j++){
                if(arr[j] > arr[j+1]){
                   /* int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;*/
                    swap(arr,j,j+1);
                    isFlag = false;
                }
            }
            if(isFlag){
                break;//没有数据交换，说明数组已经有序，退出排序
            }

        }

    }
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {56,-8,4,5,4,56,2,-7,89,88};
        BubbleSort2 bs = new BubbleSort2();
        bs.bubbleSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
