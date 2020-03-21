package com.qlu.collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

/**
 * @author jiajinshuo
 * @create 2020-01-08 17:21
 * 测试Collection接口中的方法
 * add(Object obj),addAll(Collection coll),clear(),isEmpty(),size()
 * contains()
 * 向Collection接口的实现类的对象中添加数据obj时，要求obj所在类要重写equals().
 */
public class CollectionTest {
    public static void main(String[] args) {

        Collection coll = new ArrayList();
        //1，add()添加元素
        coll.add(123);//自动装箱
        coll.add(new Date());
        coll.add("AA");
        coll.add(new Person(12,"tom"));
        coll.add(new String("hello"));

        System.out.println(coll.size());

        Collection coll1 = new ArrayList();
        coll1.add("CC");
        coll1.add(123);
        //2，将另一个集合中的元素添加到当前集合
        coll.addAll(coll1);
        //3，计算集合的大小
        System.out.println(coll.size());
        System.out.println(coll);

        //4，coll.clear();//清空集合元素
        System.out.println(coll.isEmpty());
        System.out.println("******************************");
        //5，contains()判断是否包含某元素。比较时调用equals()
        System.out.println(coll.contains(123));
        System.out.println(coll.contains(new Person(12,"tom")));//false,重写equals()后为true
        System.out.println(coll.contains(new String("hello")));//true
        //6，containsAll()当前集合是否包含另一个集合
        System.out.println(coll.containsAll(coll1));
        System.out.println("*****************************");

        System.out.println(coll);
        //7, remove()移除单个元素
        coll.remove(123);//只移除了第一个123
        System.out.println(coll);
        System.out.println(coll1);
        //8，removeAll()从当前集合移除另一个集合的所有元素（共有的）。差集
        coll.removeAll(coll1);
        System.out.println(coll);
        System.out.println("*********************************");

        coll1.add("AA");
        //9,两个集合的交集
        coll.retainAll(coll1);
        System.out.println(coll);
        System.out.println(coll1);
        //10,判断两个集合是否相等
        System.out.println(coll.equals(coll1));
        //11,计算元素的哈希值
        System.out.println(coll.hashCode());
        //12.toArray()将集合转化为数组
        Object[] objects = coll.toArray();
        //13,asList()数组转化为集合
        System.out.println(Arrays.asList(objects));

    }
}
