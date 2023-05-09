package cn.jsoncc.iterator;

/**
 * @author JsonCC
 * @date 2023/5/9 16:07
 * @desc
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveFromListExample {
    public static void main(String[] args) {
        // 创建一个示例List
        List<Data> dataList = new ArrayList<>();
        dataList.add(new Data(1, "A"));
        dataList.add(new Data(2, "B"));
        dataList.add(new Data(3, "C"));
        dataList.add(new Data(1, "D"));
        dataList.add(new Data(5, "E"));
        System.out.println("原数组：" + dataList);

        // 遍历List并移除满足条件的数据
        Iterator<Data> iterator = dataList.iterator();
        while (iterator.hasNext()) {
            Data data = iterator.next();
            if (data.getValue() == 1) {
                iterator.remove();
            }
        }

        // 输出移除后的List
        for (Data data : dataList) {
            System.out.println(data);
        }
    }

    // 示例数据类
    static class Data {
        private int value;
        private String name;

        public Data(int value, String name) {
            this.value = value;
            this.name = name;
        }

        public int getValue() {
            return value;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "value=" + value +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
