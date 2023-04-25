package cn.jsoncc.time;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 定时
 */
public class TimerDemo {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 0;

            @Override
            public void run() {
                System.out.println("Timer task started: " + count);
                count++;
                if (count == 5) {
                    System.out.println("Timer task finished");
                    timer.cancel();
                }
            }
        };
        long delay = 1000L; // 1秒后开始执行
        long period = 1000L; // 1秒钟执行一次
        timer.scheduleAtFixedRate(task, delay, period);
    }
}
