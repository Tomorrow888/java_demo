package com.equalsoverried;

/**
 * @author jiajinshuo
 * @create 2019-12-29 18:03
 */
public class EqualsTest {
    public static void main(String[] args) {

        Customer cus = new Customer(18, "tom");
        Customer cus1 = new Customer(18, "tom");
        System.out.println(cus.equals(cus1));

        System.out.println(cus);
        System.out.println("========================");
        Customer cus2 = new Customer();
        System.out.println(cus2);//Customer{age=1, name='zhangsan'}
    }
}
