package mybatis.mapper;

import java.io.InputStream;
import java.util.List;

import mybatis.po.OrdersCustom;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

public class UserMapperOrdersTest {

	private SqlSessionFactory sqlSessionFactory;
	@Before
	public void setUp() throws Exception {
		//����sqlSessionFactory
		String resource = "SqlMapConfig.xml"; //mybatis�����ļ�
	
		//�õ������ļ�����
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		//�����Ự����SqlSessionFactory,Ҫ����mybaits�������ļ�����
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
	}
	
	@Test
	public void testUserMapperOrders() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapperOrders userMapperOrders = sqlSession.getMapper(UserMapperOrders.class);
		List<OrdersCustom> list = userMapperOrders.findOrdersUser();
		System.out.println(list);
	}
	
	@Test
	public void testUserMapperOrdersResultMap() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapperOrders userMapperOrders = sqlSession.getMapper(UserMapperOrders.class);
		List<OrdersCustom> list = userMapperOrders.findOrdersUserResultMap();
		System.out.println(list);
	}

}
