package cn.jsoncc.service.impl;

import cn.jsoncc.mapper.UserMapper;
import cn.jsoncc.model.User;
import cn.jsoncc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author: JsonCC
 * Date: 2023/6/24 18:29
 * Email:
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
