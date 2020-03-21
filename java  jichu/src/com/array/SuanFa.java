package com.array;

/**
 * @author jiajinshuo
 * @create 2019-12-22 17:29
 * 算法的考查:数组的复制、反转、查找(线性查找、二分法查找)
 */
public class SuanFa {
    public static void main(String[] args) {

        String[] arr1 = {"aa","bb","cc","dd"};
        String[] arr2 = new String[arr1.length];

        for(int i = 0;i<arr2.length;i++){
            arr2[i] = arr1[i];
        }
        //数组的反转
        /*for(int i = 0;i<arr1.length/2;i++){
            String temp = arr1[arr1.length - i -1];
            arr1[arr1.length - i - 1] = arr1[i];
            arr1[i] = temp;
        }*/
        for(String i:arr1){
            System.out.print(i+"  ");
        }
        //查找（搜索）线性查找
        String dest = "aa";
        boolean isFlag = true;
        for(int i = 0;i<arr1.length;i++){
            if(dest.equals(arr1[i])){//如果不是字符串可以用==，查找第一次出现的索引
                System.out.println("目标在"+i);
                isFlag = false;
                break;
            }
        }
        if(isFlag){
            System.out.println("没有找到");
        }
        //二分法查找
        //所要查找的数组必须有序
        int[] arr3 = {-5,-4,5,6,58,69,96,99};
        int dest1 = 5;
        int head = 0;//初始的索引
        int end = arr3.length - 1;//初始的末索引
        boolean isFlag1 = true;

        while (head <= end){

            int middle = (head + end) /2;
            if(dest1 == arr3[middle]){
                System.out.println("二分查找法找到了指定的元素在"+middle);
                isFlag1 = false;
                break;
            }else if(arr3[middle] > dest1){
                end = middle - 1;
            }else{//arr3[middle < dest1
                head = middle + 1;
            }

        }
        if(isFlag1){
            System.out.println("没有找到");
        }

    }
}
