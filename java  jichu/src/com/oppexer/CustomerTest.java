package com.oppexer;

/**
 * @author jiajinshuo
 * @create 2019-12-27 13:25
 * （1） 创建一个 Customer ，名字叫 Jane Smith, 他有一个账号为 1000，余额为 2000 元，
 * 年利率为 1.23％ 的账户。
 * （2） 对 Jane Smith 操作。
 * 存入 100 元，再取出 960 元。再取出 2000 元。
 * 打印出 Jane Smith 的基本信息
 * 成功存入 ：100.0
 * 成功取出：960.0
 * 余额不足，取款失败
 * Customer [Smith, Jane] has a account: id is 1000, annualInterestRate is 1.23％, balance is
 * 1140.0
 */
public class CustomerTest {
    public static void main(String[] args) {

        Customer cust = new Customer("Jane","Smith");
        Account acct = new Account(1000,2000,0.0123);

        cust.setAccount(acct);//赋给形参，形参又赋值给属性，相当于把acct的地址给了account，也指向了账户
        //先获得账户，再取钱
        System.out.println(cust.getAccount()+"\t"+acct);//这两个地址值一样
        cust.getAccount().deposit(100);
        cust.getAccount().withdraw(960);
        cust.getAccount().withdraw(2000);
        System.out.println("Customer ["+cust.getLastName()+","+cust.getFirstName()+"] has a account: id is "+
                acct.getId()+", annualInteresRate is "+acct.getAnnualInterestRate()*100+"%, balance is "+acct.getBalance());

    }
    

    
}
