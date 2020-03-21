package com.oppexer;

/**
 * @author jiajinshuo
 * @create 2019-12-27 13:20
 */
public class Customer {

    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f,String l){
        firstName = f;
        lastName = l;
    }
    //因为已经通过构造器初始化了，所以可以直接获得
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
