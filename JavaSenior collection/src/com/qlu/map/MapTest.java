package com.qlu.map;

import java.util.*;

/**
 * @author jiajinshuo
 * @create 2020-01-09 20:57
 */
public class MapTest {
    public static void main(String[] args) {

        Map<String,Object> map = new HashMap<>();
        //添加
        map.put("AA",123);
        //修改
        map.put("AA",56);//key相同直接覆盖掉
        map.put("456",12);
        map.put("BB",22);

        System.out.println(map);
        //删除
        Object bb = map.remove("BB");
        System.out.println(bb);
        System.out.println(map);
        //获取指定key的value
        System.out.println(map.get(456));
        System.out.println("************");

        System.out.println("遍历所有的key   keySet()");
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("遍历所有的value,遍历的顺序和key一致");
        Collection values = map.values();
        for(Object value: values){
            System.out.println(value);
        }
        System.out.println("遍历key value。Set里面放了好多个entry");
        Set entry01 = map.entrySet();
        for(Object i:entry01){
            System.out.println(i);
        }

        //Map.Entry<k,v>,Entry是内部接口
        for(Map.Entry<String,Object> entry:map.entrySet()){
            System.out.println("key:"+entry.getKey()+"   value:"+entry.getValue());
        }

    }
}
