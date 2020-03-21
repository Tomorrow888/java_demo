package com.keyword;


/**
 * @author jiajinshuo
 * @create 2020-01-01 14:25
 */
class CircleTest{
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle(6);
        System.out.println(c1.getId());
        System.out.println(c2.getId());
        System.out.println(c3.getId());
        System.out.println("创建的圆的个数为:"+Circle.getTotal());

    }
}
public class Circle {

    private double radius;
    private int id;

    public Circle(){
        id = init ++;
        total++;
    }

    public Circle(double radius){
        this();
        this.radius = radius;
//        /*id = init ++;
//        total++;*/
    }

    private static int total;
    private static int init = 1001;//被所有对象所共享

    public double findArea(){
        return 3.14 * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public static int getTotal() {
        //操作属性的方法也是static
        return total;
    }
}
