package com.jiajinshuo;

/**
 * @author jiajinshuo
 * @create 2020-03-23 10:27
 */
public class SeasonTest {
    public static void main(String[] args) {
        Season.valueOf("SPRING").show();//春天在哪里
    }

}
interface Info{

    void show();
        }
enum Season implements Info{

    //public static final Season SPRING = new Season("春天","春暖花开");
    //每一个对象都实现方法

    SPRING("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("春天在哪里");
        }
    },
    SUMMER("夏天","烈日炎炎") {
        @Override
        public void show() {
            System.out.println("宁夏");
        }
    },
    AUTUMN("秋天","秋高气爽") {
        @Override
        public void show() {
            System.out.println("秋天不回来");
        }
    },
    WINTER("冬天","冰天雪地") {
        @Override
        public void show() {
            System.out.println("大约在冬季");
        }
    };

    private final String seasonName;
    private final String seasonDesc;

    private Season(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }


}