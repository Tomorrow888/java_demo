package date.date1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author jiajinshuo
 * @create 2020-01-07 13:38
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        //SimpleDateFormat的实例化。默认构造器
        SimpleDateFormat sdf = new SimpleDateFormat();
        //格式化：日期------->字符串
        String format = sdf.format(new Date());
        System.out.println(format);//20-1-7 下午1:46
        //解析   ：字符串---------->日期
        String str = "20-1-7 下午1:46";//格式统一
        Date parse = sdf.parse(str);
        System.out.println(parse);

        System.out.println("指定格式格式化和解析，使用带参构造器");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = sdf1.format(new Date());
        System.out.println(format1);

        Date parse1 = sdf1.parse("2020-01-08 02:01:26");//必须符合构造器参数
        System.out.println(parse1);


    }
}
