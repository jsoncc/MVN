package cn.jsoncc.demo.thread;

/**
 * @author JsonCC
 * @date 2023/6/20 10:22
 * @desc .start()启动线程后自动调用run方法，无需等待run()方法执行完毕
 */
public class StartThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.start();
        System.out.println("finish");
    }

    static class MyThread implements Runnable {
        @Override
        public void run() {
            System.out.println("MyThread run start");
            try {
                Thread.sleep(5 * 1000); //等待s
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("MyThread run end");
        }
    }
}