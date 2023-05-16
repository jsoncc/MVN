package cn.jsoncc.thread;

/**
 * @author JsonCC
 * @date 2023/5/16 14:38
 * @desc 在多线程示例的基础上，加入synchronized使其先执行thread2 ，后执行thread1
 */
public class MultiThreadExample1 {
    public static void main(String[] args) {
        // 创建两个线程并启动
        Thread thread1 = new NumberThread(1, 5);
        Thread thread2 = new NumberThread(6, 10);

        // 启动线程2
        thread2.start();

        // 等待线程2执行完毕
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 启动线程1
        thread1.start();
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
            synchronized (MultiThreadExample1.class) {
                for (int i = start; i <= end; i++) {
                    System.out.println("Number: " + i);
                }
            }
        }
    }
}

