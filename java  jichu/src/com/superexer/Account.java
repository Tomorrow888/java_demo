package com.superexer;

import com.oppexer2.Bank;

/**
 * @author jiajinshuo
 * @create 2019-12-28 17:44
 */
public class Account {

    private int id;//账号
    private double balance;//余额
    private double annualInterestRate;//年利率

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    //返回月利率
    public double getMonthlyInterest(){

        return annualInterestRate / 12;
    }
    //取钱
    public void withdraw (double amount){
        if(balance >= amount){
            System.out.println("取钱成功");
            balance-=amount;
            return;
        }
        System.out.println("余额不足");
    }
    //存钱
    public void deposit (double amount){
        if(amount > 0){
            System.out.println("存钱成功");
            balance+=amount;
        }
    }
}
