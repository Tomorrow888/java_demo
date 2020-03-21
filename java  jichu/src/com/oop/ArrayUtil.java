package com.oop;

/**
 * @author jiajinshuo
 * @create 2019-12-26 11:24
 * 封装数组工具类
 */
public class ArrayUtil {
    //求数组最大值
    public int getMax(int[] arr){
        int arrayMax = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i] > arrayMax){
                arrayMax = arr[i];
            }
        }
        return arrayMax;
    }
    //求数组最小值
    public int getMin(int[] arr){
        int arraMin = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<arraMin){
                arraMin = arr[i];
            }
        }
        return arraMin;
    }
    //求数组的总和
    public int getSum(int[] arr){
        int arraySum = 0;
        for(int i = 0;i< arr.length;i++){
            arraySum+=arr[i];
        }
        return arraySum;
    }
    //求数组的平均值
    public int getAvg(int[] arr){
        //方法中调用方法，我还愁怎么把局部变量arraySum拿进来
        return (getSum(arr) / arr.length);
    }
    //反转数组
    public void reverse(int[] arr){
        for(int i = 0;i< arr.length / 2;i++){
            int temp = arr[i];
            arr[i]  = arr[arr.length - 1 -i];
            arr[arr.length - i - 1] = temp;

        }

    }
    //数组的复制
    public int[] arrayCopy(int[] arr){
        int[] arr1 = new int[arr.length];
        for(int i = 0;i<arr1.length;i++){
            arr1[i] = arr[i];
        }
        return arr1;
    }
    //元素的查找
    public int getIndex(int[] arr,int dest){
        for(int i = 0;i<arr.length;i++){
            if(dest == arr[i]){
                return i;
            }
        }
        return -1;//返回一个负数表示没有找到

    }
}
