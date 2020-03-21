package com.array;

import java.util.Arrays;

/**
 * @author jiajinshuo
 * @create 2019-12-25 13:02
 * Arrays工具类的使用
 */
public class ArraysTest {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,3,2,4};
        System.out.println(Arrays.equals(arr1,arr2));//判断两个数组是否相等
        System.out.println(Arrays.toString(arr2));//输出数组的信息。直接遍历

        Arrays.fill(arr1,10);//将指定的值填充到数组之中，全部替换。[10, 10, 10, 10]
        System.out.println(Arrays.toString(arr1));

        int[] arr3 = {-89,-8,5,45,54,66,88,99,789};
        int index = Arrays.binarySearch(arr3,99);//二分查找法
        if(index >= 0){
            System.out.println("目标的索引"+index);
        }else {
            System.out.println("未找到");
        }
    }



}
