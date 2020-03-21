package com.extendsexer1;

/**
 * @author jiajinshuo
 * @create 2019-12-27 19:34
 */
public class CylinderTest {
    public static void main(String[] args) {

        Cylinder cy = new Cylinder();
        cy.setRadius(2.5);
        cy.setLength(5.0);
        System.out.println("圆柱的体积为："+ cy.findVolume());
        System.out.println("圆柱的表面积为："+cy.findArea());
    }
}
