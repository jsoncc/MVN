package cn.jsoncc.demo.iterator;

/**
 * Author: JsonCC
 * Date: 2024/1/18 17:08
 * 1. 查找整数
 * 输入：一个有序数组array，一个整数n 输出：如果n在array里，输出n的位置；如果n不在array中输出n可以插入的位置，插入后的数组仍然有序 例如：
 *
 * ●[1,3,5,6], 5 → 2
 * ●[1,3,5,6], 2 → 1
 * ●[1,3,5,6], 7 → 4
 * ●[1,3,5,6], 0 → 0
 *
 * 时间复杂度：
 * 二分法的时间复杂度是 O(log n)，其中 n 是数据集合的大小。在每一次比较后，搜索范围都被缩小为原来的一半，因此它具有非常高效的查找速度。
 * 空间复杂度：
 * 二分法的空间复杂度是 O(1)，也就是常量级的空间。它并不需要额外的存储空间，只需几个变量来保存边界和中间索引。
 */
public class SearchInsertPosition {
    public static int number(int[] array, int n) {
        int front = 0;
        int after = array.length - 1;
        while (front <= after) {
            int mid = front + (after - front) / 2;// 如果a = 1.6 那么int a = 1;
            System.out.println("数组中位数：" + array[mid]);
            if (array[mid] == n) {
                return mid;
            } else if (array[mid] < n) {
                front = mid + 1;
            } else {
                after = mid - 1;
            }
        }
        return front;
    }

    public static void main(String[] args) {
//        int[] array1 = {1, 3};
//        System.out.println(number(array1, 2)); // 输出: 2

        int[] array2 = {1, 3, 5, 6};
        System.out.println(number(array2, 5)); // 输出: 2
//
//        int[] array3 = {1, 3, 5, 6};
//        System.out.println(number(array3, 7)); // 输出: 4
//
//        int[] array4 = {1, 3, 5, 6};
//        System.out.println(number(array4, 0)); // 输出: 0
    }
}

