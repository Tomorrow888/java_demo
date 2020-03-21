package com.extendsexer;

/**
 * @author jiajinshuo
 * @create 2019-12-27 18:30
 */
public class ManKind {

    private int salary;//薪资
    private int sex;//性别

    public ManKind() {
    }

    public ManKind(int salary, int sex) {
        this.salary = salary;
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void manOrWoman(){
        if(sex == 1){
            System.out.println("man");
        }else if(sex == 0){
            System.out.println("woman");
        }
    }
    public void employeed(){
        String jobInfo = (salary == 0)? "no job" :"job";
        System.out.println(jobInfo);
    }
}
