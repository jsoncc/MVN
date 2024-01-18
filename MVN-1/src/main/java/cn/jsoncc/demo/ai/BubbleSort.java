package cn.jsoncc.demo.ai;

import java.util.Arrays;

/**
 * @author JsonCC
 * @date 2023/12/26 15:32
 * @desc 算法：冒泡排序
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 23, 15, 11};

        System.out.println("原始数组: " + Arrays.toString(array));

        // 使用冒泡排序算法排序数组
        BubbleSort.sort(array);

        System.out.println("排序后的数组: " + Arrays.toString(array));
    }

    public static void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        int length = array.length;
        //外层：需要length-1次循环比较
        for (int i = 0; i < length - 1; i++) {
            //内层：每次循环需要两两比较的次数，每次比较后，都会将当前最大的数放到最后位置，所以每次比较次数递减一次
            for (int j = 0; j < length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    //交换数组array的j和j+1位置的数据
                    swap(array, j, j + 1);
                }
            }
        }
    }

    /**
     * 交换数组array的i和j位置的数据
     *
     * @param array 数组
     * @param i     下标i
     * @param j     下标j
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}


