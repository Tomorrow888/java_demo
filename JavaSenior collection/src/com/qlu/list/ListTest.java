package com.qlu.list;

import com.qlu.collection.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author jiajinshuo
 * @create 2020-01-09 11:49
 */
public class ListTest {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(123);
        list.add(456);
        list.add(new Person(45,"mot"));
        list.add("AA");
        list.add(456);

        System.out.println(list);
        //void add(int index, Object ele):在index位置插入ele元素
        list.add(1,"BB");
        System.out.println(list);

        List list1 = Arrays.asList(1, 2, 3);
        //boolean addAll(int index, Collection eles):从index位置开始将eles中
        //的所有元素添加进来
        list.addAll(0,list1);
        System.out.println(list);

        Object o = list.get(0);//返回当前索引的元素
        System.out.println(o);

        int i = list.indexOf(123);//返回第一次出现的位置
        System.out.println(i);

        Object remove = list.remove(5);//移除指定索引的元素
        System.out.println(remove);

        System.out.println(list);
        //遍历方式一
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("********************");
        //遍历方式二
        for(Object m:list){
            System.out.println(m);
        }
        System.out.println("*************************");
        //遍历方式三
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));

        }


    }
}
