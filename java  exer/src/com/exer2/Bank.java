package com.exer2;

/**
 * @author jiajinshuo
 * @create 2019-12-29 13:21
 */
public class Bank {

    private Customer[] customers;
    private int numberOfCustomers;

    public Bank(){
        customers = new Customer[10];
    }

    public void addCustomer(String f,String l){
       Customer cust =  new Customer(f,l);
       customers[numberOfCustomers++] = cust;
    }

    public Customer getCustomers(int index) {
        if(index >= 0 && index < numberOfCustomers){
            return customers[index];
        }
        return null;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomers;
    }
}
