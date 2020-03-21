package com.keyword.block;

/**
 * @author jiajinshuo
 * @create 2020-01-01 17:23
 */
public class BlockTest {
    public static void main(String[] args) {

        System.out.println("-----------------------");//这个例子和尚硅谷的不一样，尚硅谷的main方法在Son类中
        //Son类加载先加载
       // String desc = Person.desc;//hello static block! 使用类时，类加载到内存中
       // System.out.println(desc);
        Person p1 = new Person();


    }
}
class Person{

    String name;
    int age ;
    static String desc = "我是一个人";

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //static的代码块
    static {
        System.out.println("hello static block!");

    }
    //非static代码块
    {
        System.out.println("hello block!");

    }
    public static void info(){
        System.out.println("我是一个快乐的人");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}