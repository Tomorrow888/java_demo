package com.oop;

/**
 * @author jiajinshuo
 * @create 2019-12-26 12:48
 * jdk5开始：可变个数形参。参数是0个或多个
 * 格式：
 * 数据类型...变量名
 * 与本类中，方法名相同，参数不同的方法之间构成重载。
 * 类似数组。把[] 换成...
 */
public class MethodArgs {

    public void show(int i){}
    public void show(int i,int j){}
    public void show(int ... i){

    }
    //public void show(int[] i){}  与方法名相同，形参类型也相同的数组不构成重载

    public static void main(String[] args) {
        MethodArgs ma = new MethodArgs();
        ma.show(1,2,3,7);
        ma.show();

    }
    public void show (int i ,String ... str){}//在参数列表中必须放在末尾
}
