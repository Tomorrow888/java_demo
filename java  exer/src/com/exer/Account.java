package com.exer;

/**
 * @author jiajinshuo
 * @create 2019-12-29 12:41
 */
public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;

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

    //取钱
    public void  withdraw(double amount){

        if(balance >= amount){
            System.out.println("成功取出"+amount);
            balance -= amount;
            return;
        }
        System.out.println("余额不足！");

    }
    public void deposit(double amount){
        if(amount > 0){
            System.out.println("成功存入"+amount);
            balance+=amount;
        }
    }
}
