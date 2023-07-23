package cn.jsoncc.demo.time;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * Author: JsonCC
 * Date: 2023/7/23 17:45
 * Msg: 获取上月第一天的00:00:00和最后一天的23:59:59
 */
public class MonthDate {
    public static void main(String[] args) {
        // 获取当前日期
        Calendar calendar = Calendar.getInstance();
        // 将月份减一，得到上个月的日期
        calendar.add(Calendar.MONTH, -1);

        // 获取上个月的第一天
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        Date firstDayOfLastMonth = calendar.getTime();//Thu Jun 01 19:41:45 CST 2023

        // 获取上个月的最后一天
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        Date lastDayOfLastMonth = calendar.getTime();//Fri Jun 30 19:41:45 CST 2023

        // 将 java.util.Date 转换为 java.time.LocalDateTime
        LocalDateTime dateTimeStart = firstDayOfLastMonth.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();//2023-06-01T19:41:45.002
        LocalDateTime dateTimeEnd = lastDayOfLastMonth.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();//2023-06-30T19:41:45.002

        // 获取这一天最开始的时间（即零时零分零秒）
        LocalDateTime startOfDay = dateTimeStart.with(LocalTime.MIN);//2023-06-01T00:00
        String formattedStartOfDay = startOfDay.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));//2023-06-01 00:00:00

        // 获取这一天最后的时间（即23时59分59秒）
        LocalDateTime endOfDay = dateTimeEnd.with(LocalTime.MAX);//2023-06-30T23:59:59.999999999
        String formattedendOfDay = endOfDay.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));//2023-06-30 23:59:59

        System.out.println("上个月的第一天：" + formattedStartOfDay);//上个月的第一天：2023-06-01 00:00:00
        System.out.println("上个月的最后一天：" + formattedendOfDay);//上个月的最后一天：2023-06-30 23:59:59
    }
}
