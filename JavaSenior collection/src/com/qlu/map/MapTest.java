package com.qlu.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author jiajinshuo
 * @create 2020-01-09 20:57
 */
public class MapTest {
    public static void main(String[] args) {

        Map map = new HashMap();
        //添加
        map.put("AA",123);
        //修改
        map.put("AA",56);//key相同直接覆盖掉
        map.put(456,12);
        map.put("BB",22);

        System.out.println(map);
        //删除
        Object bb = map.remove("BB");
        System.out.println(bb);
        System.out.println(map);
        //获取指定key的value
        System.out.println(map.get(456));
        System.out.println("************");
        //遍历所有的key   keySet()
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //遍历key value。Set里面放了好多个entry
        Set entry = map.entrySet();
        for(Object i:entry){
            System.out.println(i);
        }

    }
}
