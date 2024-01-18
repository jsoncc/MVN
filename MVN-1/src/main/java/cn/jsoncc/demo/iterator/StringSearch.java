package cn.jsoncc.demo.iterator;

/**
 * Author: JsonCC
 * Date: 2024/1/18 17:32
 * 2. 字符串查找
 * 输入: 字符串str1， 字符串str2
 * 输出: 字符串str2在字符串str1中第一次出现的位置。如果没有返回-1.
 * 例如： str1=“www.taobao.com” str2="taobao"  ->  4
 * 其它要求：不能使用String类的indexOf方法
 */
public class StringSearch {
    public static int strStr(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        for (int i = 0; i <= len1 - len2; i++) {
            int j;
            for (j = 0; j < len2; j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    break;
                }
            }
            if (j == len2) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str1 = "www.taobao.com";
        String str2 = "taobao";
        System.out.println(strStr(str1, str2)); // 输出: 4
    }
}

