package cn.jsoncc.time;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
        import java.util.concurrent.ScheduledExecutorService;
        import java.util.concurrent.TimeUnit;

/**
 * @author Jsoncc
 * 定时任务：从当前时间开始每次增加1秒并输出
 */
public class TimerEx {
    private final static SimpleDateFormat FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        Runnable task = () -> {
            try {
                //输出的内容
                System.out.println(FORMAT.format(new Date()));
                //间隔的时间，单位：毫秒，1000毫秒=1秒
//                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("定时设置错误");
            }

        };

        //成功运行后在多长时间之后开始输出，单位：秒
        int initialDelay = 0;
        //输出的间隔，单位：秒
        int period = 1;

        executor.scheduleAtFixedRate(task, initialDelay, period, TimeUnit.SECONDS);
    }
}

