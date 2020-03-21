package com.qlu.map;

import java.util.Set;
import java.util.TreeMap;

/**
 * @author jiajinshuo
 * @create 2020-01-10 21:45
 */
public class TreeMapTest {
    public static void main(String[] args) {

//        Person p1 = new Person(12, "tom");
//        Person p2 = new Person(15, "jerry");
//        Person p3 = new Person(22, "jack");
//        Person p4 = new Person(33, "marry");

        TreeMap map = new TreeMap();
        map.put(4,66);
        map.put(2,88);
        map.put(0,55);
        map.put(3,89);

        Set set = map.entrySet();
        for(Object i:set){
            System.out.println(i);
        }

    }
}
