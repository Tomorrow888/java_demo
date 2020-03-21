package com.equalsoverried;

import java.util.Objects;

/**
 * @author jiajinshuo
 * @create 2019-12-29 17:41
 */
public class Customer {

    private int age;
    private String name;
    public Customer(){
        this.age = 1;
        this.name = "zhangsan";//无参构造一样可以给属性赋值
    }

    public Customer(int age, String name) {
        this.age = age;
        this.name = name;
    }


    /*  @Override   手动重写equals()
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof Customer){
            Customer cust = (Customer)obj;
            return this.age == cust.age && this.name.equals(cust.name);
        }else {
            return false;
        }
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age &&
                name.equals(customer.name);//因为String里面的已经重写了。如果计较的是Person类型的，
        // 因为没有重写过，所以要在Person类中重写

    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
