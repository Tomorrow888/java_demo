package com.exer2;

/**
 * @author jiajinshuo
 * @create 2019-12-29 13:14
 */
public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    //存钱
    public void deposit(double amt){
        if(amt > 0){
            System.out.println("成功存入"+amt);
            balance+=amt;
        }


    }
    //取钱
    public void withdraw(double amt){
        if(balance >= amt){
            System.out.println("成功取钱"+amt);
            balance-=amt;
            return;
        }
        System.out.println("余额不足");
    }
}
