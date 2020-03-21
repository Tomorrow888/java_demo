package com.qlu.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author jiajinshuo
 * @create 2020-01-09 16:45
 */
public class TreeSetTest {
    public static void main(String[] args) {

        Set set = new TreeSet();

        set.add(123);
        set.add(455);
        set.add(456);
        set.add(158);


        System.out.println(set);
    }
}
