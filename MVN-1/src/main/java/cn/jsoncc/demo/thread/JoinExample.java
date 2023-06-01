package cn.jsoncc.demo.thread;

/**
 * @author JsonCC
 * @date 2023/5/5 16:00
 * @desc
 */
public class JoinExample {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("Starting Thread 1");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished Thread 1");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Starting Thread 2");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished Thread 2");
        });

        t1.start();
        t2.start();

        System.out.println("Waiting for threads to finish...");

        //等待线程 t1 执行完成
        t1.join();
        //等待线程 t2 执行完成
        t2.join();

        System.out.println("All threads finished execution.");
    }
}

