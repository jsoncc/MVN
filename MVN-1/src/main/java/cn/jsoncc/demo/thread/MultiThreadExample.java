package cn.jsoncc.demo.thread;

/**
 * @author JsonCC
 * @date 2023/5/16 14:01
 * @desc 多线程示例
 */
public class MultiThreadExample {
    public static void main(String[] args) {
        // 创建两个线程并启动
        Thread thread1 = new NumberThread(1, 5);
        Thread thread2 = new NumberThread(6, 10);
        thread1.start();
        thread2.start();
    }

    // 自定义线程类，用于打印一定范围内的数字
    private static class NumberThread extends Thread {
        private int start;
        private int end;

        public NumberThread(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i <= end; i++) {
                System.out.println("Number: " + i);
            }
        }
    }
}
