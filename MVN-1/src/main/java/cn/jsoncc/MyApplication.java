package cn.jsoncc;

import cn.jsoncc.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.SpringVersion;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Arrays;

/**
 * @author JsonCC
 * @date 2023/5/26 14:23
 * @desc 主启动类
 */

@RestController
@SpringBootApplication
@ComponentScan("cn.jsoncc")
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
//        SpringApplication.run(MyApplication.class, args);

        ConfigurableApplicationContext context = SpringApplication.run(MyApplication.class, args);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        Person person = context.getBean(Person.class);
        System.out.println("person" + person);
    }

}

