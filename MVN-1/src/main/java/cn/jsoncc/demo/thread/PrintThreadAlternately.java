package cn.jsoncc.demo.thread;

/**
 * Author: JsonCC
 * Date: 2024/1/18 17:40
 * 3. 三个线程交替打印alialiali...
 * 三个线程交替打印alialiali...，一个打印a，一个打印l，一个打印i
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintThreadAlternately {
    private static Lock lock = new ReentrantLock();
    private static Condition conditionA = lock.newCondition();
    private static Condition conditionL = lock.newCondition();
    private static Condition conditionI = lock.newCondition();
    private static int count = 10; // 控制打印次数

    public static void main(String[] args) {
//        new Thread(() -> printChar('a', conditionA, conditionL)).start();
        new Thread(() -> printChar('l', conditionL, conditionI)).start();
        new Thread(() -> printChar('i', conditionI, conditionA)).start();
    }

    private static void printChar(char ch, Condition current, Condition next) {
        lock.lock();
        try {
            for (int i = 0; i < count; i++) {
                try {
                    while (true) {
                        if (current == conditionA && i % 3 == 0 ||
                                current == conditionL && i % 3 == 1 ||
                                current == conditionI && i % 3 == 2) {
                            System.out.print(ch);
                            next.signal();
                            break;
                        } else {
                            current.await();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}

