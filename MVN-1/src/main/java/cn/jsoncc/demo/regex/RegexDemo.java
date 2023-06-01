package cn.jsoncc.demo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author JsonCC
 * @date 2023/5/9 10:42
 * @desc
 */
public class RegexDemo {
    public static void main(String[] args) {
        String html = "<div> <div class=\"outer\"> <div class=\"time\">这是一个，this is some</div> <div class=\"button\">button</div> </div> </div>";
        //方式1
//        String regex = "<div class=\"time\">(.*?)</div>";
        //方式2
        String regex = "<div class=\"time\">([^<]*)</div>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);
        if (matcher.find()) {
            System.out.println(matcher.group(1));
        } else {
            System.out.println("正则表达式查找错误！");
        }
    }
}
