package com.extendsexer1;

/**
 * @author jiajinshuo
 * @create 2019-12-27 19:30
 */
public class Cylinder extends Circle{

    private double length;

    public Cylinder(){
        length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    //返回圆柱的体积
    public double findVolume(){
        //return Math.PI * getRadius()* getRadius();
        return super.findArea() * getLength();
        //return findArea()* length;
    }

    @Override
    public double findArea() {//返回圆柱的表面积
        return Math.PI  * getRadius() * getRadius() * 2 + 2 * Math.PI * getRadius() * length;
    }
}
