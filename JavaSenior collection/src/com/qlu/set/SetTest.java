package com.qlu.set;

import com.qlu.collection.Person;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author jiajinshuo
 * @create 2020-01-09 12:52
 */
public class SetTest {
    public static void main(String[] args) {

        Set set = new HashSet();

        set.add(123);
        set.add(455);
        set.add("AA");
        set.add("CC");
        set.add(new Person(56,"tom"));

        System.out.println(set);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());//
        }

    }
}
