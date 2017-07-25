package cn.edu.cumt.xxxt.Service;

import org.apache.ibatis.annotations.Param;

public interface GoodService {
	void addGood(String good_name,String good_num,Integer price,String catagory_sn,Integer count);
	void changeGood(String good_name,String good_num,Integer price,String catagory_sn,Integer count);
	void deleteGood(String good_name,String good_num,Integer price,String catagory_sn,Integer count);
}
