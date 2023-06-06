package cn.jsoncc.entity;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author JsonCC
 * @date 2023/6/5 15:41
 * @desc
 */
@Data
@ConfigurationProperties(prefix = "operator")
public class Person {
    private String name;
    private String age;
}
