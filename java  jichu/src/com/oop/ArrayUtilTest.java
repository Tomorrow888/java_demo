package com.oop;

import java.util.Arrays;

/**
 * @author jiajinshuo
 * @create 2019-12-26 11:30
 */
public class ArrayUtilTest {
    public static void main(String[] args) {

        ArrayUtil au = new ArrayUtil();
        int[] arr = {56,-2,88,0,9,89,66};

        System.out.println(au.getMax(arr));
        System.out.println(au.getMin(arr));
        System.out.println(au.getSum(arr));
        System.out.println(au.getAvg(arr));
        au.reverse(arr);
        System.out.println(Arrays.toString(arr));
        int index = au.getIndex(arr, 0);
        if(index>=0){
            System.out.println("找到了，索引为"+index);
        }else {
            System.out.println("没有找到");
        }

    }
}
