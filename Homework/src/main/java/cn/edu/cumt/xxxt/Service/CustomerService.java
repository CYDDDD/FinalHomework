package cn.edu.cumt.xxxt.Service;

import cn.edu.cumt.xxxt.entity.Customer;

//调用CustomerMapper这个接口提供的功能
/*
 * Customer服务层接口
 */
public interface CustomerService {
	/**
	 * 判断用户登录
	 * @Param Integer customer_id
	 * @Param String pwd
	 * @return 找到返回Customer对象，没有找到返回null
	 **/
	Customer login(Integer customer_id,String pwd);
	void addCustomer(String customer_name,String mail,String pwd);
	void changeLoginPwd(Integer customer_id,String pwd);
}
