package cn.jsoncc;

import cn.jsoncc.mapper.UserMapper;
import cn.jsoncc.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * @author JsonCC
 * @date 2023/6/28 16:14
 * @desc
 */
@SpringBootTest
public class MvnTest {

    @Autowired(required = false)
    private UserMapper userMapper;
    @Autowired(required = false)
    private DataSource dataSource;

    @Test
    void dataSource() throws SQLException {
        System.out.println(dataSource.getConnection());
    }

    void testGetAll(){
        List<User> list = userMapper.getAll();
        System.out.println(list);
    }
}
