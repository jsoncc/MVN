package cn.jsoncc.demo.treemap;

import java.util.*;

/**
 * @author JsonCC
 * @date 2023/6/21 13:50
 * @desc
 */

public class MapSort {
    public static void main(String[] args) {
        // 创建一个Map对象
        Map<String, String> map = new HashMap<>();
        map.put("1200", "Charlie");
        map.put("1104", "Alpha");
        map.put("1201", "Bravo");
        map.put("1300", "Delta");

        // 创建新的 TreeMap，并传入自定义的比较器
        Map<String, String> sortedMap = new TreeMap<>(new CustomComparator());

        // 遍历原始的 map 对象，将以 "12" 开头的键值对添加到新的 TreeMap 中
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().startsWith("12")) {
                sortedMap.put(entry.getKey(), entry.getValue());
            }
        }

        // 遍历原始的 map 对象，将非以 "12" 开头的键值对添加到新的 TreeMap 中
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!entry.getKey().startsWith("12")) {
                sortedMap.put(entry.getKey(), entry.getValue());
            }
        }

        // 打印排序后的结果
        for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // 自定义比较器
    static class CustomComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            if (s1.startsWith("12") && !s2.startsWith("12")) {
                return -1; // s1 较小
            } else if (!s1.startsWith("12") && s2.startsWith("12")) {
                return 1; // s1 较大
            } else {
                return s1.compareTo(s2); // 按照自然顺序比较
            }
        }
    }
}
