package com.keyword.abstracttest;

import java.util.Calendar;

/**
 * @author jiajinshuo
 * @create 2020-01-02 14:14
 * 定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各
 * 类雇员对象的引用。利用循环结构遍历数组元素，输出各个对象的类
 * 型,name,number,birthday。当键盘输入本月月份值时，如果本
 * 月是某个Employee对象的生日，还要输出增加工资信息。
 */
public class PayrollSystem {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入当前月份：");
//        int month = scanner.nextInt();
        //方式二
        Calendar instance = Calendar.getInstance();
        int month = instance.get(Calendar.MONTH);//获取当前月份

        Employee[] emps = new Employee[2];//并不是new了抽象类，只是创建了数组，里面的元素是抽象类
        //多态
        emps[0] = new SalariedEmployee("tom",1001,new MyDate(1998,1,1),10000);
        emps[1] = new HourlyEmployee("jerry",1002,new MyDate(1996,6,6),60,240);

        for(int i = 0;i<emps.length;i++){
            System.out.println(emps[i]);
            double earinings = emps[i].earinings();

            if(month + 1 == emps[i].getBirthday().getMonth()){
                System.out.println("生日快乐！工资加100");
                earinings+=100;

            }
            System.out.println("月工资为"+earinings);
        }
    }
}
