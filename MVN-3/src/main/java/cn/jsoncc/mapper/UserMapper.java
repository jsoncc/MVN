package cn.jsoncc.mapper;

import cn.jsoncc.model.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@MapperScan("cn.jsoncc.mapper")
public interface UserMapper {

    List<User> getAll();
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}