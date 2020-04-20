package com.constructor;

/**
 * @author jiajinshuo
 * @create 2020-04-20 11:24
 */
public class ConstructorTest {
    public static void main(String[] args) {
        User user = new User(18);
        System.out.println(user);
    }
}
class User{

    private String name;
    private Integer age;
    private String gender;

    public User(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public User(Integer age) {
        this.age = age;
        this.gender = "男";
        this.name = "jiajinshuo";
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}