package cn.jsoncc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

/**
 * @author JsonCC
 * @date 2023/5/26 14:23
 * @desc 主启动类
 */

@RestController
@SpringBootApplication
public class MyApplication {

    @RequestMapping("/index")
    String home() {
        long time = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String springVersion = SpringVersion.getVersion();
        String springBootVersion = SpringBootVersion.getVersion();
        return "Spring版本:" + springVersion + "\nSpringBoot版本:" + springBootVersion + "\n时间：" + sdf.format(time);
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}

