package cn.jsoncc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author JsonCC
 * @date 2023/6/20 13:40
 * @desc 访问路径：地址+端口号+swagger-ui.html#/   例如：http://localhost:1000/swagger-ui.html#/
 */
@Configuration
@EnableSwagger2 // 启用Swagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.jsoncc.controller")) // 设置扫描的包路径
                .paths(PathSelectors.any())
                .build();
    }
}

