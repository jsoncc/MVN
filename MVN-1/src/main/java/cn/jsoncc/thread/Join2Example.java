package cn.jsoncc.thread;

/**
 * @author JsonCC
 * @date 2023/5/5 17:09
 * @desc
 */
public class Join2Example {

    public static void main(String[] args) throws InterruptedException {
        // 创建两个线程并启动
        Thread thread1 = new Thread(new MyRunnable("Thread1", 5000));
        Thread thread2 = new Thread(new MyRunnable("Thread2", 3000));
        thread1.start();
        thread2.start();

        // 在主线程中调用join方法，等待thread1和thread2线程执行结束
        thread1.join();
        thread2.join();

        System.out.println("All threads have finished.");
    }
}

class MyRunnable implements Runnable {

    private String name;
    private int sleepTime;

    public MyRunnable(String name, int sleepTime) {
        this.name = name;
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        System.out.println(name + " is running.");
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " has finished.");
    }
}

