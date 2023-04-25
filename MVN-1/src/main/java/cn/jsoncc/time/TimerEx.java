package cn.jsoncc.time;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
        import java.util.concurrent.ScheduledExecutorService;
        import java.util.concurrent.TimeUnit;

public class TimerEx {
    private final static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        Runnable task = () -> {
            //输出的内容
            System.out.println(format.format(new Date()));
        };

        //成功运行后在多长时间之后开始输出，单位：秒
        int initialDelay = 0;
        //输出的间隔，单位：秒
        int period = 60;

        executor.scheduleAtFixedRate(task, initialDelay, period, TimeUnit.SECONDS);
    }
}

