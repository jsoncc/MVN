package cn.jsoncc.demo.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author JsonCC
 * @date 2023/9/7 14:41
 * @desc
 */
public class LambdaOfSort {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange");
        Collections.sort(list, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

    }
}
