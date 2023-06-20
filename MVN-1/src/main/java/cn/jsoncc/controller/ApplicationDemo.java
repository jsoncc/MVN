package cn.jsoncc.controller;

import cn.jsoncc.entity.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JsonCC
 * @date 2023/6/5 14:17
 * @desc
 */
@RequestMapping(value = "/list")
@RestController
@EnableConfigurationProperties({Person.class})
public class ApplicationDemo {

    @Autowired
    Person person;

    @ApiOperation(value = "主页", notes = "人员信息GET")
    @RequestMapping(value = "/personGet", method = RequestMethod.GET)
    public Person person() {
        return person;
    }

}

