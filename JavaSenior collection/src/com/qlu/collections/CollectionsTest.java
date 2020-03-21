package com.qlu.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jiajinshuo
 * @create 2020-01-11 11:46
 */
public class CollectionsTest {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add(66);
        list.add(66);
        list.add(12);
        list.add(-8);
        list.add(89);

        Collections.sort(list);//自然排序
        System.out.println(list);

        Comparable max = Collections.max(list);//获取最大数
        System.out.println(max);

        int frequency = Collections.frequency(list, 66);//获取出现频率
        System.out.println(frequency);
        //返回的list1为线程安全
        List list1 = Collections.synchronizedList(list);

    }
}
