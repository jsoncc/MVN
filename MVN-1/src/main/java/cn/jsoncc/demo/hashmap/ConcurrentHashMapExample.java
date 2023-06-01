package cn.jsoncc.demo.hashmap;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author JsonCC
 * @date 2023/5/18 9:43
 * @desc ConcurrentHashMap示例
 */
public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("Monday", "周一");
        map.put("February", "周二");
        map.put("Thursday", "周四");
        map.put("周日", "Sunday");
        System.out.println("ConcurrentHashMap原值：" + map);
        map.remove("February");
        System.out.println(map.get("February"));
        System.out.println(map.get("Thursday"));
        System.out.println(map.get("周四"));
        System.out.println(map.get("周日"));
        System.out.println("去除一个值：" + map);

    }
}
