package cn.jsoncc.demo.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author JsonCC
 * @date 2023/9/13 13:09
 * @desc
 */
public class CopyDemo {
    public static void main(String[] args) {
        List<Integer> srcList = new ArrayList<>();
        srcList.add(10);
        srcList.add(88);
        srcList.add(100);
        List<Integer> destList = new ArrayList<>();
        destList.add(-1);
        destList.add(0);
        destList.add(1);
        //调用copy()方法，将srcList集合中的元素复制到destList集合中
        // java.lang.IndexOutOfBoundsException: Source does not fit in dest
        //destList表示目标集合对象，srcList表示源集合对象。
        Collections.copy(destList, srcList);
        System.out.println(destList);
    }
}
