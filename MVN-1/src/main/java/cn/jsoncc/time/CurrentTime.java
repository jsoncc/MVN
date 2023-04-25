package cn.jsoncc.time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 系统当前时间和时间戳格式转换
 */
public class CurrentTime {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println("当前系统时间：（时间戳）" + time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("当前系统时间：（日期格式）" + sdf.format(time));
    }
}
