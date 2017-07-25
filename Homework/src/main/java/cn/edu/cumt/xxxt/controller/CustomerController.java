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
 * �����û����������
 **/
@Controller
public class CustomerController {
	/**
	 * �Զ�ע��CustomerService
	 **/
	@Autowired
	@Qualifier("customerService")
	private CustomerService customerService;
	/**
	 *����login����
	 */
	@RequestMapping(value="/login")
	public ModelAndView login(
			Integer customer_id,String pwd,
			ModelAndView mv,
			HttpSession session){
		//�����˺ź���������û����ж��û���¼
		Customer customer = customerService.login(customer_id, pwd);
		if(customer != null) {
			//��¼�ɹ�����customer�������õ�HttpSession���÷�Χ��
			session.setAttribute("customer", customer);
			//ת������main����
			mv.setView(new RedirectView("browse"));
		}else {
			//��½ʧ�ܣ���ת����¼ҳ��			
			mv.setViewName("index");
		}
		return mv;}
		
	/**
	 * ����ע������
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
			
			
			
	
	
				
			

