package cn.jsoncc.thread;

/**
 * @author JsonCC
 * @date 2023/5/16 13:59
 * @desc 单线程示例
 */
public class SingleThreadExample {
    public static void main(String[] args) {
        // 单线程逐个打印数字
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
        }
    }
}

