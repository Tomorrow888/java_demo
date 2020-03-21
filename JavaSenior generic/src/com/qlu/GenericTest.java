package com.qlu;

import java.util.*;

/**
 * @author jiajinshuo
 * @create 2020-01-09 21:36
 */
public class GenericTest {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(78);
        list.add(56);
        list.add(88);
        list.add(77);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            int score = iterator.next();//自动拆箱
            System.out.println(score);
        }

        HashMap<String, Integer> map = new HashMap<>();

        map.put("aa",12);
        map.put("cc",22);
        map.put("dd",66);
        map.put("bb",56);

        Set<Map.Entry<String, Integer>> e = map.entrySet();
        Iterator<Map.Entry<String, Integer>> e1 = e.iterator();

        while(e1.hasNext()){
            Map.Entry<String, Integer> next = e1.next();//此时得到的是Entry
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key+"-----"+value);


        }

    }
}
