package cn.edu.cumt.xxxt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import cn.edu.cumt.xxxt.Service.GoodService;

/**
 * 处理用户请求控制器
 **/
@Controller
public class GoodController {
	/**
	 * 自动注入GoodService
	 **/
	@Autowired
	@Qualifier("goodService")
	private GoodService goodService;
	/**
	 * 处理添加请求
	 * */
	@RequestMapping(value="/addthing")
	public String addthing(String good_name, String good_num,Integer price, String catagory_sn,Integer count) {
		goodService.addGood(good_name,good_num,price,catagory_sn,count);
		return "addGoodSuccess";
		}
	
	

	@RequestMapping(value="/updatething")
	public String updatething( String good_name, String good_num,Integer price, String catagory_sn,Integer count) {
		goodService.changeGood(good_name,good_num,price,catagory_sn,count);
		return "updateGoodSuccess";
		}
	
	@RequestMapping(value="/deletething")
	public String deletething( String good_name, String good_num,Integer price, String catagory_sn,Integer count) {
		goodService.deleteGood(good_name,good_num,price,catagory_sn,count);
		return "deleteGoodSuccess";
		}
	
}
