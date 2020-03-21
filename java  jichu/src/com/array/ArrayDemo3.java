package com.array;

/**
 * @author jiajinshuo
 * @create 2019-12-22 17:00
 * (1 )创建-一个名为ArrayTest的类， 在main( )方法中声明array1和array2两个变量，他们是int [ ]类型的数组。
 * (2 )使用大括号{},把array1初始化为8个素数: 2,3,5,7,11,13,17 ,19。
 * (3 )显示array1的内容。
 * (4)赋值array2变量等于array1,修改array2中的偶索引元素，使其等于索引值(如array[0]=0,array[2]=2)。打印出array1.
 * 实现array2对array1数组的复制
 */
public class ArrayDemo3 {
    public static void main(String[] args) {

        int[] array1,array2;
        array1 = new int[]{2,3,5,7,11,13,17,19};

        for(int i:array1){
            System.out.print(i+"\t");
        }
        System.out.println();
        //array2 = array1;//把地址赋给array2。不能称作是复制。没有在内存中开辟新的空间。
        array2 = new int[array1.length];

        for(int i = 0;i<array1.length;i++){
            array2[i] = array1[i];//复制
        }
        for(int i = 0;i<array1.length;i++){
            if(i % 2 == 0){
                array2[i] = i;
            }
        }
        for(int i:array1){
            System.out.print(i+"\t");
        }
       /* 2	3	5	7	11	13	17	19
         0	3	2	7	4	13	6	19*/
    }
}
