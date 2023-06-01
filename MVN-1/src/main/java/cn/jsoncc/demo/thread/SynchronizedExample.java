package cn.jsoncc.demo.thread;

/**
 * @author JsonCC
 * @date 2023/5/5 14:14
 * @desc
 */
public class SynchronizedExample {
    private int count;

    public static void main(String[] args) {
        SynchronizedExample example = new SynchronizedExample();
        example.doWork();
    }

//    public synchronized void increment() {
//        count++;
//    }

    public void doWork() {
        Runnable task = () -> {
            for (int i = 0; i < 10; i++) {
//                increment();
                count++;
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        try {
//            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count is: " + count);
    }
}

