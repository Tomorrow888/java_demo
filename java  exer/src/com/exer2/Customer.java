package com.exer2;

/**
 * @author jiajinshuo
 * @create 2019-12-29 13:19
 */
public class Customer {

    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f,String l){
        firstName = f;
        lastName = l;
    }

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
