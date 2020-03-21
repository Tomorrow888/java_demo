package date.date1;

import java.util.Date;

/**
 * @author jiajinshuo
 * @create 2020-01-05 17:54
 */
public class DateTest {
    public static void main(String[] args) {

        Date date1 = new Date();
        System.out.println(date1);
        System.out.println(date1.getTime());//获取1970--至今毫秒数

        Date date2 = new Date(1578218255442L);//扔进毫秒，转换时间
        System.out.println(date2);
    }
}
