package com.qlu.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jiajinshuo
 * @create 2020-05-07 14:37
 */
public class MapFor {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();

        map.put("1",1);
        map.put("2",2);

        // 遍历
        for(Map.Entry<String,Object> entry:map.entrySet()){
            System.out.println(entry.getKey()+"---------"+entry.getValue());
        }
    }
}
