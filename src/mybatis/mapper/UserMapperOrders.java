package mybatis.mapper;

import java.util.List;

import mybatis.po.OrdersCustom;

public interface UserMapperOrders {
	
	//��ѯ������������ѯ�û���Ϣ
	public List<OrdersCustom> findOrdersUser() throws Exception;
	
	//��ѯ������������ѯ�û���Ϣ,ʹ��resultMap
	public List<OrdersCustom> findOrdersUserResultMap() throws Exception;

}
