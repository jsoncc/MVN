package cn.jsoncc.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JsonCC
 * @date 2023/6/5 14:17
 * @desc
 */
@RequestMapping(value = "hello")
@RestController
public class ApplicationDemo {
    @RequestMapping(value = "/list")
    public String list(){
        return "Hello JAVA!!";
    }
}
