package com.extendsexer1;

/**
 * @author jiajinshuo
 * @create 2019-12-27 18:55
 */
public class Circle {

    private double radius;

    public Circle(){
        radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //返回圆的面积
    public double findArea(){
        return Math.PI * radius * radius;
    }
}
