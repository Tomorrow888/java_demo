package com.extendsexer;

/**
 * @author jiajinshuo
 * @create 2019-12-27 18:39
 */
public class Kids extends ManKind {

    private int yearsOld;

    public void printAge(){
        System.out.println("i am "+yearsOld+" years old");
    }

    public Kids() {
    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
}
