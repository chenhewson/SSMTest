package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import com.ssm.entity.UserInf;
public class TestCase {
	@Test
	public void findUserId() throws IOException{
		String resource = "config/spring-mybatis.xml";
		//得到配置文件流
		InputStream input = Resources.getResourceAsStream(resource);
		//创建sqlsessionfactory 
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
		//得到session
		SqlSession sqlsession = sqlSessionFactory.openSession();
		//通过sqlsession操作数据库
		//第一个参数：映射文件的id,
		//第二个参数：指定和映射文件parameterType所匹配的参数
		
		UserInf user = sqlsession.selectOne("test.findUserId","陈");
		System.out.println(user);
	}
	@Test
	public void findUserByName() throws IOException {
		String resource = "config/spring-mybatis.xml";
		//得到配置文件流
		InputStream input = Resources.getResourceAsStream(resource);
		//创建sqlsessionfactory 
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
		//得到session
		SqlSession sqlsession = sqlSessionFactory.openSession();
		List<UserInf> user=sqlsession.selectList("com.ssm.dao.findByName","chen");
		System.out.println(user);
	}

}
