package cn.jsoncc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

/**
 * @author JsonCC
 * @date 2023/5/26 14:23
 * @desc
 */

@RestController
@SpringBootApplication
public class MyApplication {

    @RequestMapping("/index")
    String home() {
        long time = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "Hello World!!!" + sdf.format(time);
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}

