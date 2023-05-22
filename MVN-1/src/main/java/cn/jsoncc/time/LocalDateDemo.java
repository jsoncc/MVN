package cn.jsoncc.time;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @author JsonCC
 * @date 2023/5/22 9:20
 * @desc Date，LocalDate，LocalTime，LocalDateTime，DateTimeFormatter，SimpleDateFormat，Duration，Period
 */
public class LocalDateDemo {
    public static void main(String[] args) {
        //Fri Jun 22 00:00:00 CST 3923
        Date date = new Date(2023, 4, 22);
        Date now = new Date();
        System.out.println("指定日期：" + date);

        //当前日期，格式：年月日，of()可以指定年月日时分秒
        //2023-05-22
        LocalDate localDate = LocalDate.now();
        LocalDate birthday = LocalDate.of(2000, 5, 20);
        System.out.println("当前日期：" + localDate);

        //当前时间，格式：时分秒毫秒
        //15:55:38.906
        LocalTime localTime = LocalTime.now();
        System.out.println("当前时间：" + localTime);

        //当前日期时间
        //2023-05-22T15:55:38.907
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("当前日期时间：" + localDateTime);

        //format格式化
        //2023年05月22日
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String dateStr = localDate.format(dtf);
        System.out.println("format指定格式化当前时间：" + dateStr);

        //指定格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(now));

        //加时间和减时间
        //2024-05-22T15:55:38.938
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime localDateTime0 = ldt.plusYears(1);
        LocalDateTime localDateTime1 = ldt.plusMonths(3);
        LocalDateTime localDateTime2 = ldt.plusHours(2);
        LocalDateTime localDateTime3 = ldt.minusYears(8);
        System.out.println(localDateTime0);

        //计算两个时间之间的间隔
        //2023-05-22T16:14:25.637与2023-05-22T18:14:25.677间隔分钟：120
        Duration duration = Duration.between(localDateTime, localDateTime2);
        System.out.println(localDateTime + "与" + localDateTime2 + "间隔分钟：" + duration.toMinutes());

        //计算两个日期之间的间隔，LocalDate格式
        //23
        Period period = Period.between(birthday, localDate);
        System.out.println(period.getYears());

    }
}
