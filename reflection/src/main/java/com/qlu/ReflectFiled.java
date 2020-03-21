package com.qlu;

import org.junit.Test;
import reflection.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author jiajinshuo
 * @create 2019-12-18 22:47
 */
public class ReflectFiled {

    @Test
    public void testField() throws Exception {

        Class<Person> clazz = Person.class;
        //创建运行时类的对象
        Person p = clazz.newInstance();
        //获取指定的属性,要求运行时类中那个的属性为public，不常用
        Field id = clazz.getField("age");
        //设置当前属性
        id.set(p,1001);
        Integer page = (Integer) id.get(p);
        System.out.println(page);


    }
    @Test
    public void testField2() throws Exception {
        
        Class clazz = Person.class;
        Person p = (Person)clazz.newInstance();

        Field age = clazz.getDeclaredField("age");
        //保证当前属性是可访问的
        age.setAccessible(true);

        age.set(p,25);
        System.out.println(age.get(p));

    }
    //操作运行时类的指定对象
    @Test
    public void testField3()throws Exception{

        Class clazz =  Person.class;
        Person p = (Person)clazz.newInstance();
        //获取指定的方法.参数1，指明方法的名称，参数2，指明获取方法的形参列表
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        //invoke是调用的意思，调用方法得传实参。参数1，犯法的调用者。参数2，给方法形参赋值的实参
        showNation.invoke(p,"china");
        //如果为静态方法，invoke方法里面填Person.class(类直接调用）

    }
}
