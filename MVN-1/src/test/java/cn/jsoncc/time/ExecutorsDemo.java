package cn.jsoncc.time;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Component
@Slf4j
public class ExecutorsDemo {
    private final static ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(5);
    private final static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:sss");

    @PostConstruct
    @Test
    public void init() {
        scheduler.schedule(() -> {
            try {
                log.info("开始执行...time {}", format.format(new Date()));
                Thread.sleep(1000);
                log.info("执行结束...time {}", format.format(new Date()));
            } catch (Exception e) {
                log.error("定时任务执行出错");
            }
        }, 5, TimeUnit.SECONDS);
        log.info("初始化成功 {}", format.format(new Date()));
    }

}

