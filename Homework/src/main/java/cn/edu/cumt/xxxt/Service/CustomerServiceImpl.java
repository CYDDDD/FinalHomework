package cn.edu.cumt.xxxt.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.edu.cumt.xxxt.entity.Customer;
import cn.edu.cumt.xxxt.mapper.CustomerMapper;

/**
 * Customer服务层接口实现类
 * @Service("customerService")用于将当前类注释为一个Spring的bean,名为customerService
 */

@Service("customerService")

public  class CustomerServiceImpl implements CustomerService {
	/**
	 * 自动注入CustomerMapper
	 */
	@Autowired
	private CustomerMapper customerMapper;
	/**
	 * CustomerService接口实现login方法
	 * @see { CustomerService}
	 **/
	@Override
	public Customer login(Integer customer_id,String pwd) {
		return customerMapper.findwithCustomer_idAndPwd(customer_id,pwd);}
	
	/*
	 * CustomerService接口实现addCustomer方法
	 * @see { CustomerService}
	 */
	@Override
	public  void addCustomer(String customer_name,String mail,String pwd) {
		customerMapper.saveCustomer(customer_name,mail,pwd);
	}
	
	@Override
	public  void changeLoginPwd(Integer customer_id,String pwd) {
		customerMapper.changepwd(customer_id,pwd);
	}
}
