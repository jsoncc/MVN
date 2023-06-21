package cn.jsoncc.demo.treemap;

import java.util.*;

/**
 * @author JsonCC
 * @date 2023/6/21 13:43
 * @desc 对Map<String, String>里面的数据按指定key排序
 */

public class TreeMapDemo {
    public static void main(String[] args) {
        // 创建一个Map对象
        Map<String, String> map = new HashMap<>();
        map.put("1200", "Charlie");
        map.put("1104", "Alpha");
        map.put("1201", "Bravo");
        map.put("1300", "Delta");

        // 使用TreeMap按键进行排序
        Map<String, String> sortedMap = new TreeMap<>(map);

        // 打印排序后的结果
        for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

