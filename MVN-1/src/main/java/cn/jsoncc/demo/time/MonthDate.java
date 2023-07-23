package cn.jsoncc.demo.time;

/**
 * Author: JsonCC
 * Date: 2023/7/23 17:45
 * Msg: volatile作用：
 *   保 证 内 存 可 见 性 和 禁 止 指 令 重 排 。
 *   用 于 多 线 程 环 境 下 的 单 次 操 作 (单 次 读 或 者 单 次 写 )。
 *      volatile 关键字用于确保多个线程之间对变量的可见性，即一个线程修改了 volatile 变量的值，其他线程能够立即看到最新的值，而不是使用自己线程缓存中的旧值。
 *      一句话说明 volatile 的应用场景：用于多线程环境下，当一个变量被多个线程访问和修改时，通过使用 volatile 关键字可以保证变量的可见性，避免了数据不一致的问题。
 * 下面代码举例：
 * 有两个线程 thread1 和 thread2，它们都执行 incrementTask 任务，即对 count 进行 10000 次自增操作。由于 count 是共享变量，多个线程都会对它进行操作。
 *
 * 如果不使用 volatile 关键字来修饰 count，可能会导致可见性问题，即一个线程对 count 做了修改，但另一个线程可能看不到最新的值，从而导致最终的结果不是期望的 20000。
 *
 * 通过将 count 声明为 private static volatile int count = 0;，我们使用了 volatile 关键字来确保多个线程之间对 count 的可见性，从而保证线程之间的数据同步。运行上述代码，最终的 count 值将会是 20000。
 */
public class MonthDate {
    private static volatile int count = 0;

    public static void main(String[] args) {
        Runnable incrementTask = () -> {
            for (int i = 0; i < 10000; i++) {
                count++; // 自增操作
            }
        };

        Thread thread1 = new Thread(incrementTask);
        Thread thread2 = new Thread(incrementTask);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count value: " + count);
    }
}
