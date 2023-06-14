package cn.jsoncc.demo.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author: JsonCC
 * Date: 2023/6/14 22:16
 * Email:896415482@qq.com
 */

public class Convert {
    public static void main(String[] args) {
        String dateString = "2023-06-14 14:50:00"; // 要转换的日期字符串

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 定义日期格式

        try {
            Date date = sdf.parse(dateString); // 将字符串解析为Date对象
            System.out.println(date); // 输出解析后的Date对象
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

