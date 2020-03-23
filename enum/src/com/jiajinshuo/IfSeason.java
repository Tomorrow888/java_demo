package com.jiajinshuo;

/**
 * @author jiajinshuo
 * @create 2020-03-23 11:00
 */
public class IfSeason {
    public static String desc(String season){
        String result = "";
        if(season.equals("SPRING")){
            result = "春天在哪里";
        }else if(season.equals("SUMMER")){
            result = "宁夏";
        }else if(season.equals("AUTUMN")){
            result = "秋天不回来";
        }else if(season.equals("WINTER")){
            result = "大约在冬季";
        }else {
            result = "xxx";
        }

        return result;
    }

    public static void main(String[] args) {
        String spring = desc("SPRING");
        System.out.println(spring);
    }
}
