package cn.jsoncc.demo.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author JsonCC
 * @date 2023/9/7 14:26
 * @desc 使用Lambda表达式进行集合遍历
 */
public class LambdaDemo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange");
        list.forEach(fruit -> System.out.println(fruit));
    }

    public static void main1(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange");
        for (String fruit : list) {
            System.out.println(fruit);
        }

    }
}
