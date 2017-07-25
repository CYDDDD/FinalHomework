package cn.edu.cumt.xxxt.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.edu.cumt.xxxt.entity.Customer;
import cn.edu.cumt.xxxt.entity.Good;


public interface CustomerMapper {
	/**
	 * 根据登陆Id和密码查询用户
	 * @param Integer customer_id
	 * @param String pwd
	 * @return 找到返回Customer对象，没有找到返回null
	 **/
	@Select("select * from customer where customer_id=#{customer_id} and pwd=#{pwd}")
	Customer findwithCustomer_idAndPwd(@Param("customer_id")Integer customer_id,
			@Param("pwd")String pwd);
	
	

	@Insert("insert into customer(customer_name,mail,pwd) Values(#{customer_name},#{mail},#{pwd})")
	void saveCustomer(@Param("customer_name")String customer_name ,@Param("mail")String mail,@Param("pwd")String pwd);
	
	@Select("select * from customer")
	List<Customer> selectcustomer();
	@Update("update customer "+ "set pwd=#{pwd} where customer_id=#{customer_id}")
	void changepwd(@Param("customer_id")Integer customer_id,@Param("pwd")String pwd);
}

