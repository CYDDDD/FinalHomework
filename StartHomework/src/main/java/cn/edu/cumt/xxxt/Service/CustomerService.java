package cn.edu.cumt.xxxt.Service;

import cn.edu.cumt.xxxt.entity.Customer;

//����CustomerMapper����ӿ��ṩ�Ĺ���
/*
 * Customer�����ӿ�
 */
public interface CustomerService {
	/**
	 * �ж��û���¼
	 * @Param Integer customer_id
	 * @Param String pwd
	 * @return �ҵ�����Customer����û���ҵ�����null
	 **/
	Customer login(Integer customer_id,String pwd);
	void addCustomer(String customer_name,String mail,String pwd);
	void changeLoginPwd(Integer customer_id,String pwd);
}
