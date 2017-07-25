package cn.edu.cumt.xxxt.controller;




import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import cn.edu.cumt.xxxt.Service.CustomerService;
import cn.edu.cumt.xxxt.entity.Customer;

/**
 * 处理用户请求控制器
 **/
@Controller
public class CustomerController {
	/**
	 * 自动注入CustomerService
	 **/
	@Autowired
	@Qualifier("customerService")
	private CustomerService customerService;
	/**
	 *处理login请求
	 */
	@RequestMapping(value="/login")
	public ModelAndView login(
			Integer customer_id,String pwd,
			ModelAndView mv,
			HttpSession session){
		//根据账号和密码查找用户，判断用户登录
		Customer customer = customerService.login(customer_id, pwd);
		if(customer != null) {
			//登录成功，将customer对象设置到HttpSession作用范围域
			session.setAttribute("customer", customer);
			//转发发送main请求
			mv.setView(new RedirectView("browse"));
		}else {
			//登陆失败，跳转到登录页面			
			mv.setViewName("index");
		}
		return mv;}
		
	/**
	 * 处理注册请求
	 * */
	@RequestMapping(value="/register1")
	public String register1(String customer_name,String mail,String pwd) {
		customerService.addCustomer(customer_name, mail, pwd);
		return "success";
		}
	
	@RequestMapping(value="/changepassword")
	public String changepassword(Integer customer_id,String pwd) {
		customerService.changeLoginPwd(customer_id,pwd);
		return "successchange";
		}
	}
			
			
			
	
	
				
			

