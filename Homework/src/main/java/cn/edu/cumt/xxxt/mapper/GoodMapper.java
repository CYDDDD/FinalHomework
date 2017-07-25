package cn.edu.cumt.xxxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.edu.cumt.xxxt.entity.Good;

public interface GoodMapper {

	@Insert("insert into good(good_name,good_num,price,catagory_sn,count) Values(#{good_name},#{good_num},#{price},#{catagory_sn},#{count})")
	void saveGood(@Param("good_name")String good_name,@Param("good_num")String good_num,@Param("price")Integer price,@Param("catagory_sn")String catagory_sn,@Param("count")Integer count);
	
	
	@Select("select * from good")
	List<Good> selectgood();
	@Update("update good "+" set good_name=#{good_name},price=#{price},catagory_sn=#{catagory_sn},count=#{count} where good_num=#{good_num}" )
	void updateGood(@Param("good_name")String good_name,@Param("good_num")String good_num,@Param("price")Integer price,@Param("catagory_sn")String catagory_sn,@Param("count")Integer count);
	
	@Delete("delete from good where good_num=#{good_num}")
	void removeGood(@Param("good_name")String good_name,@Param("good_num")String good_num,@Param("price")Integer price,@Param("catagory_sn")String catagory_sn,@Param("count")Integer count);
			
}
