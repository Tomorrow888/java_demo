package com.extendsexer;

/**
 * @author jiajinshuo
 * @create 2019-12-27 18:49
 */
public class KidsTest {
    public static void main(String[] args) {

        Kids k = new Kids(12);
        k.printAge();

        k.setSalary(0);
        k.setSex(1);

        k.manOrWoman();
        k.employeed();
    }
}
