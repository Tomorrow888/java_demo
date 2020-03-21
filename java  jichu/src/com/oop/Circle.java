package com.oop;

/**
 * @author jiajinshuo
 * @create 2019-12-25 18:05
 * 反面案例
 */
public class Circle {

    //已经声明的成员变量如果在类中再声明一次，会报错，但是在方法中就不会(无论是在形参列表还是在方法体中）

    double radius;

    public double area(double r){
        double radius = 0;
        return (radius*radius);
    }


}
class Test{
    public static void main(String[] args) {
        Circle circle = new Circle();
        double area = circle.area(4);
        System.out.println(area);


    }
}
