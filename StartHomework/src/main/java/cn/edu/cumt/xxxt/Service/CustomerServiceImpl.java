package cn.edu.cumt.xxxt.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.edu.cumt.xxxt.entity.Customer;
import cn.edu.cumt.xxxt.mapper.CustomerMapper;

/**
 * Customer�����ӿ�ʵ����
 * @Service("customerService")���ڽ���ǰ��ע��Ϊһ��Spring��bean,��ΪcustomerService
 */

@Service("customerService")

public  class CustomerServiceImpl implements CustomerService {
	/**
	 * �Զ�ע��CustomerMapper
	 */
	@Autowired
	private CustomerMapper customerMapper;
	/**
	 * CustomerService�ӿ�ʵ��login����
	 * @see { CustomerService}
	 **/
	@Override
	public Customer login(Integer customer_id,String pwd) {
		return customerMapper.findwithCustomer_idAndPwd(customer_id,pwd);}
	
	/*
	 * CustomerService�ӿ�ʵ��addCustomer����
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
