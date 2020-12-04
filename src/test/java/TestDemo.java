import com.dmu.covid.entity.User;
import com.dmu.covid.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author : hadoo
 * @Date : 2020/12/3 13:44
 */
public class TestDemo {
    private SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "mybatis/mybatis-cfg.xml";
        InputStream is = Resources.getResourceAsStream(resource);

        return new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void testMyBatis3Simple() throws IOException {
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 向数据中查询 id 为 1 的用户信息
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectAll();
        System.out.println(users.get(0).toString());

    }
}