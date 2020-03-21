package com.oop;

/**
 * @author jiajinshuo
 * @create 2019-12-26 18:38
 * 递归
 * 向着已知的方向去递归
 */
public class RecursionTest {
    public static void main(String[] args) {

        RecursionTest rt = new RecursionTest();

        System.out.println(rt.getSum(100));
        System.out.println(rt.jieCheng(10));
        System.out.println(rt.f(10));
        System.out.println(rt.f1(8));

    }
    //计算1-100自然数的和
    public int getSum(int n){
        if(n == 1){
            return 1;
        }else {
            return n + getSum(n - 1);
        }
    }
    //n的阶乘
    public int jieCheng(int n){
        if(n == 1){
            return 1;
        }else {
            return n*jieCheng(n-1);
        }
    }
    //已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),其中n是大于0
    //的整数，求f(10)的值。
    public int f(int n){
        if(n == 0){
            return 1;
        }else if(n == 1){
            return 4;
        }else {
            return 2 * f(n - 1) +f(n - 2);
        }
    }
    //输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值
    //1 1 2 3 5 8 13 21 34 55
    //规律：一个数等于前两个数之和
    //要求：计算斐波那契数列(Fibonacci)的第n个值，并将整个数列打印出来
    public int f1(int n){
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 1;
        }else {
            return f1(n - 1)+f1(n - 2);
        }
    }
}
