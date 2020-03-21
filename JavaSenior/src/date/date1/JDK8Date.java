package date.date1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author jiajinshuo
 * @create 2020-01-07 14:49
 * JDK8新的日期API
 */
public class JDK8Date {
    public static void main(String[] args) {

        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ld);
        System.out.println(lt);
        System.out.println(now);

        System.out.println(now.getDayOfYear());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String format = dtf.format(now);
        System.out.println(format);
    }
}
