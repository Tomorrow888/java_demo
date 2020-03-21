package com.qlu.compare;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author jiajinshuo
 * @create 2020-01-09 17:21
 * 创建该类的 4 个对象，并把这些对象放入 TreeSet 集合中（下一章：
 * TreeSet 需使用泛型来定义）
 * 分别按以下两种方式对集合中的元素进行排序，并遍历输出：
 * 1). 使 Employee 实现 Comparable 接口，并按 name 排序
 * 2). 创建 TreeSet 时传入 Comparator 对象，按生日日期的先后排序。
 */

public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new Employee("zhoujielun", 40, new MyDate(1978, 1, 18));
        Employee e2 = new Employee("wanglihong", 43, new MyDate(1975, 1, 28));
        Employee e3 = new Employee("taozhe", 45, new MyDate(1973, 5, 8));
        Employee e4 = new Employee("linjunjie", 39, new MyDate(1981, 1, 4));

        TreeSet<Employee> treeSet = new TreeSet<>();

        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);

        Iterator<Employee> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //定制排序
        TreeSet<Employee> treeSet1 = new TreeSet<>(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Employee && o2 instanceof Employee){
                    Employee e1 = (Employee)o1;
                    Employee e2 = (Employee)o2;

                    MyDate b1 = e1.getBirthday();
                    MyDate b2 = e2.getBirthday();
                    //比较年
                    int minusYear = b1.getYear() - b2.getYear();
                    if(minusYear != 0){
                        return minusYear;
                    }
                    //比较月
                    int minusMonth = b1.getMonth() - b2.getMonth();
                    if(minusMonth != 0){
                        return minusMonth;
                    }
                    //比较天
                    int minusDay = b1.getDay() - b2.getDay();
                    if(minusDay != 0){
                        return minusDay;
                    }
                }
                throw new RuntimeException("输入数据类型错误");
            }
        });

    }
}
