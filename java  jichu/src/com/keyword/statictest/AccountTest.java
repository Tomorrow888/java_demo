package com.keyword.statictest;

/**
 * @author jiajinshuo
 * @create 2020-01-01 15:24
 */
public class AccountTest {
    public static void main(String[] args) {

        Account account1 = new Account();
        Account account2 = new Account("qwerty",2000);

        Account.setInteresRate(0.012);
        Account.setMinMoney(100);

        System.out.println(Account.getInteresRate());//也可以去调用静态的结构，毕竟都是成员变量
        System.out.println(account1);
        System.out.println(account2);
    }
}
