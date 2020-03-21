package com.keyword.statictest;

/**
 * @author jiajinshuo
 * @create 2020-01-01 15:12
 * 编写一个类实现银行账户的概念，包含的属性有“帐号”、“密
 * 码”、“存款余额”、“利率”、“最小余额”，定义封装这些
 * 属性的方法。账号要自动生成。
 * 编写主类，使用银行账户类，输入、输出3个储户的上述信息。
 * 考虑：哪些属性可以设计成static属性。
 */
public class Account {

    private int id;
    private String pwd = "000000";
    private double balance;

    private static double interesRate;//利率
    private static double minMoney = 1.0;//最小余额
    private static int init = 1001;//用于自动生成id

    public Account(){
        id = init ++;
    }

    public Account(String pwd,double balance){
        id = init ++;
        this.pwd = pwd;
        this.balance = balance;//静态的一般不会在构造器内操作
    }

    public int getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInteresRate() {
        return interesRate;
    }

    public static void setInteresRate(double interesRate) {
        Account.interesRate = interesRate;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }

    @Override
    public String toString() {//都是自己的属性，static的没有
        return "Account{" +
                "id=" + id +
                ", pwd='" + pwd + '\'' +
                ", balance=" + balance +
                '}';
    }
}
