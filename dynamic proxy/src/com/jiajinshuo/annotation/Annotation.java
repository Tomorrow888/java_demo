package com.jiajinshuo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

/**
 * @author jiajinshuo
 * @create 2020-04-18 9:29
 */
public class Annotation {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class stu = Class.forName("com.jiajinshuo.annotation.Student");
        java.lang.annotation.Annotation[] annotations = stu.getAnnotations();
        for (java.lang.annotation.Annotation annotation : annotations) {
            System.out.println(annotation);

        }
        //获得注解的value值
        TableStudent annotation = (TableStudent)stu.getAnnotation(TableStudent.class);
        String[] value = annotation.value();
        System.out.println(value);

        //获得属性
        Field name = stu.getDeclaredField("name");
        TableFild annotation1 = name.getAnnotation(TableFild.class);

//        System.out.println(annotation1.columeName());
        System.out.println(annotation1.length());
    }
}
@TableStudent("tb_student")
class Student{
    //通过注解来操作表
    @TableFild(columeName = "db_id",type = "int",length = 10)
    private int id;
    @TableFild(columeName = "db_age",type = "int",length = 10)
    private int age;
    @TableFild(columeName = "db_name",type = "varchar",length = 10)
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

//类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableStudent{
    String[] value();
}
//属性的注解
@interface TableFild{
    String columeName();
    String type();
    int length();
}