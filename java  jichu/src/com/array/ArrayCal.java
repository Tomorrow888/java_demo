package com.array;

/**
 * @author jiajinshuo
 * @create 2019-12-22 16:06
 * 算法的考查:求数值型数组中元素的最大值、最小值、平均数、总和等
 * 定义一个int型的一维数组，包含10个元素，分别赋一 些随机整数，
 * 然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。
 * 要求:所有随机数都是两位数。
 */
public class ArrayCal {
    public static void main(String[] args) {

        int[] arr = new int[10];
        for(int i = 0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*(99-10+1)+10);
        }

        for(int i:arr){
            System.out.print(i+"  ");
        }
        System.out.println();
        //求元素的最大值
        int maxValue = arr[0];//如果全是负数初始值就不能为0
        for(int i = 1;i<arr.length;i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        System.out.println("最大值为"+maxValue);
        System.out.println();
        //求最小值
        int minValue = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        System.out.println("最小值为"+minValue);
        //求元素的总和
        int sum = 0;
        for(int i = 1;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("总和为"+sum+"平均数为"+(double)sum/arr.length);

    }
}
