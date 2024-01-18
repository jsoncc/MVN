package cn.jsoncc.demo.thread;

/**
 * Author: JsonCC
 * Date: 2024/1/18 17:45
 * 3. 三个线程交替打印alialiali...
 * 三个线程交替打印alialiali...，一个打印a，一个打印l，一个打印i
 */
public class AlternatePrinting {
    private static final Object lock = new Object();
    private static int count = 0;
    private static final int MAX_COUNT = 10;

    public static void main(String[] args) {
        Thread aThread = new Thread(() -> print('a'));
        Thread lThread = new Thread(() -> print('l'));
        Thread iThread = new Thread(() -> print('i'));

        aThread.start();
        lThread.start();
        iThread.start();
    }

    private static void print(char ch) {
        synchronized (lock) {
            for (int i = 0; i < MAX_COUNT; i++) {
                while (count % 3 != ch - 'a') {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.print(ch);
                count++;
                lock.notifyAll();
            }
        }
    }
}

