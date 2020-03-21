package com.oop;

/**
 * @author jiajinshuo
 * @create 2019-12-26 17:07
 * 值传递机制
 */
public class ValueTrans {
    public static void main(String[] args) {

        int m = 10;
        int n = 20;

        System.out.println("m="+m+"  n="+n);
        ValueTrans vt = new ValueTrans();
        vt.swap(m,n);
        //main方法中的m和n交换不了，交换的是swap里面的m和n。swap方法执行结束后，变量弹出栈
        //要想交换必须得用引用类型，不同的变量拥有相同的地址，指向同一个对象
        System.out.println("m="+m+"  n = "+n);

    }
    public void swap(int m,int n){
        int temp = m;
        m = n;
        n = temp;
    }
}
