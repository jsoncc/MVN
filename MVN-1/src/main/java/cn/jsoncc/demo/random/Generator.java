//package cn.jsoncc.demo.random;
//
//import cn.jsoncc.model.User;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//
//import javax.annotation.Resource;
//import java.util.List;
//
//import static cn.jsoncc.demo.random.RandomDataGenerator.generateRandomPeople;
//
///**
// * @author JsonCC
// * @date 2023/6/28 10:10
// * @desc
// */
//@Resource
//public class Generator {
//    public static void main(String[] args) {
//        List<User> people = generateRandomPeople(10);
//
//        try (SqlSession session = sqlSessionFactory.openSession()) {
//            session.insert("insertRandomData", people);
//            session.commit();
//        }
//
//        // 插入操作完成
//    }
//
//    // ...生成随机数据的方法...
//
//    private static SqlSessionFactory sqlSessionFactory;
//
//    static {
//        try (SqlSession session = SqlSessionFactoryBuilder.build(Resources.getResourceAsStream("application.yaml"))) {
//            sqlSessionFactory = session.getConfiguration().newSqlSessionFactory();
//        }
//    }
//}
