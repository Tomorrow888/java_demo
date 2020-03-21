package com.keyword.interfacetest;

/**
 * @author jiajinshuo
 * @create 2020-01-02 17:36
 */
public class ComparableCircleTest {
    public static void main(String[] args) {

        ComparableCircle c1 = new ComparableCircle(3.5);
        ComparableCircle c2 = new ComparableCircle(3.2);
        int value = c1.compareTo(c2);
        if(value > 0){
            System.out.println("c1对象大");
        }else if(value < 0 ){
            System.out.println("c2对象大");
        }else{
            System.out.println("一样大");
        }
        int value1 = c1.compareTo("abc");
        System.out.println(value1);
    }
}
