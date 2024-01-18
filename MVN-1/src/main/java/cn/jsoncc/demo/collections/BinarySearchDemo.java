package cn.jsoncc.demo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author JsonCC
 * @date 2023/9/12 16:59
 * @desc
 */
public class BinarySearchDemo {
    public static void main(String[] args) {
        //Collections的使用--查找方法
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //二分查找
        int index = Collections.binarySearch(list, 3);
        System.out.println(index);  // 2
    }
}
