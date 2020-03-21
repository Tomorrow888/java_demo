package com.test;

/**
 * @author jiajinshuo
 * @create 2019-12-28 16:21
 */
public class Person {
    public void eat(){
        System.out.println("chifan");
    }
    public void sleep(){
        System.out.println("shuijioa");
        this.eat();
    }
}

class TestPerson{
    public static void main(String[] args) {

        Person p = new Person();
        p.sleep();
    }
}
