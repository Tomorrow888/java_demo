package com.qlu;


/**
 * @author jiajinshuo
 * @create 2019-12-20 22:09
 */
public class SwitchTest {
//对于学生成绩大于60分的输出“合格”，少于60分的输出“不合格” 用switch语句实现
    //当多个case语句相同可以考虑合并
    public static void main(String[] args) {

        int score = 78;
        switch (score / 10){

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不合格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("合格");
                break;



        }
        /*//更优的解决方案：
        switch (score / 60){
            case 0:
                System.out.println("不合格");
                break;
            case 1:
                System.out.println("合格");
                break;
        }*/

    }


}
