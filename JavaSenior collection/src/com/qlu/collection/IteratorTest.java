package com.qlu.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author jiajinshuo
 * @create 2020-01-08 19:39
 * 集合元素的遍历，使用Iterator接口
 */
public class IteratorTest {
    public static void main(String[] args) {

        Collection coll = new ArrayList();

        coll.add(123);
        coll.add(456);
        coll.add(new Person(12,"jerry"));
        coll.add(new String("tom"));
        coll.add(false);

        Iterator iterator = coll.iterator();
        while(iterator.hasNext()){//判断是否还有元素
            Object obj = iterator.next();
            if("tom" .equals(obj)){
                iterator.remove();//在迭代的过程中删除指定的元素
            }
        }
        //重新遍历需要重新定义新的迭代器。因为之前的已经到头了
        Iterator iterator1 = coll.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());

        }
    }
}
