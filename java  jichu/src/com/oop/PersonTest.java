package com.oop;

/**
 * @author jiajinshuo
 * @create 2019-12-26 22:05
 */
public class PersonTest {
    public static void main(String[] args) {

        //Person p1 = new Person();//第一次new对象初始化的时候也打印了一次
       //p1.setAge(1);
        //p1.eat();
        Person p2 = new Person("jerry",18);


    }
}
class Person{

    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
//*****************************************
    public Person(){
        //this.eat();
        String info = "四十行代码";
        System.out.println(info);
    }
    /*public Person(String name){
        this();//调用无参构造器
        this.name = name;
    }*/
    public Person(int age){
        this();
        this.age = age;
    }
    public Person(String name,int age){
        this(age);//this(形参列表)调用指定本类的其它构造器
        this.name = name;
    }
}