package cn.jsoncc.demo.thread;

/**
 * @author JsonCC
 * @date 2023/5/5 17:22
 * @desc 使用线程池创建
 *
 * 线程和线程池的区别：
 *     线程是一个单独的执行线程，用于执行某个任务或代码块，可以显式创建和启动，也可以通过继承Thread类或实现Runnable接口来创建。而线程池则是一组管理线程的工具，用于自动创建、回收和管理线程，避免频繁创建和销毁线程带来的性能开销。
 *
 *     线程的创建和启动是显式的，需要手动创建线程对象、设置线程属性、调用start()方法来启动线程；而线程池的创建和启动是隐式的，只需要创建线程池对象，并将任务提交给线程池即可，线程池会自动分配线程执行任务。
 *
 *     线程的生命周期由程序员手动管理，包括线程的创建、启动、执行、中断和销毁等操作；而线程池则是自动管理线程的生命周期，包括创建、启动、执行、回收和销毁等操作。
 *
 *     线程的数量通常是固定的，由程序员根据需要手动创建和管理；而线程池则是动态管理线程的数量，根据需要自动创建或回收线程。
 *
 *     线程的执行效率相对较低，因为线程的创建和销毁需要一定的开销；而线程池的执行效率相对较高，因为线程的创建和销毁由线程池自动管理，可以避免频繁创建和销毁线程的开销。
 */
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolJoinExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Future<String>> futures = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            final int id = i;
            Future<String> future = executor.submit(() -> {
                Thread.sleep(1000);
                return "Task " + id + " is completed";
            });
            futures.add(future);
        }

        for (Future<String> future : futures) {
            System.out.println(future.get());
        }

        executor.shutdown();
    }
}

