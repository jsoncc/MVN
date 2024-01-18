package cn.jsoncc.demo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author JsonCC
 * @date 2023/9/13 11:03
 * @desc
 */
public class FillDemo {
    public static void main(String[] args) {
        //Collections的使用--替换方法
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //指定元素填充List集合
        Collections.fill(list, 10);
        System.out.println(list);  // [0, 0, 0]
    }
}
