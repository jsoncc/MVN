package cn.jsoncc.hashmap;

/**
 * @author JsonCC
 * @date 2023/5/17 15:30
 * @desc hashmap的示例
 */
import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // 创建一个HashMap对象
        HashMap<String, Integer> hashMap = new HashMap<>();

        // 插入键值对
        hashMap.put("apple", 10);
        hashMap.put("banana", 5);
        hashMap.put("orange", 8);
        System.out.println("HashMap的值：" + hashMap);

        // 获取值
        int appleCount = hashMap.get("apple");
        System.out.println("Number of apples: " + appleCount);

        // 判断是否包含指定的键
        boolean containsKey = hashMap.containsKey("banana");
        System.out.println("Contains key 'banana': " + containsKey);

        // 删除键值对
        hashMap.remove("orange");

        // 获取HashMap的大小
        int size = hashMap.size();
        System.out.println("Size of HashMap: " + size);

        // 添加键值对
        hashMap.put("watermelon", 1);
        System.out.println("添加新键值对之后的HashMap对象：" + hashMap);

        // 使用Map，添加了新的依赖com.google.guava/guava
        Map<String, String> map = Maps.newHashMap();
        map.put("Monday", "周一");
        System.out.println("map的值：" + map);

    }
}

