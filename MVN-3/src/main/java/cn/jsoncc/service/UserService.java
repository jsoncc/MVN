package cn.jsoncc.service;


import cn.jsoncc.model.User;

/**
 * Author: JsonCC
 * Date: 2023/6/24 18:29
 * Email:
 */
public interface UserService {

    User selectById(Long id);
}
