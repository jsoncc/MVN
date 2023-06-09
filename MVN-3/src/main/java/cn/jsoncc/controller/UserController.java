package cn.jsoncc.controller;

import cn.jsoncc.model.User;
import cn.jsoncc.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author JsonCC
 * @date 2023/6/25 14:26
 * @desc
 */
@RequestMapping(value = "/list")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

//    @ApiOperation(value = "用户", notes = "用户信息添加")
//    @RequestMapping(value = "/userGet", method = RequestMethod.GET)
//    public void user(){
//        User User = new User();
//        User.setName("张三");
//        User.setAge(BigDecimal.valueOf(20));
//        userService.insert(User);
//    }

    @ApiOperation(value = "用户", notes = "获取用户信息")
    @GetMapping("/select")
    public List<User> select(){
        return userService.select();
    }
}
