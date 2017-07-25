package cn.edu.cumt.xxxt.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cn.edu.cumt.xxxt.mapper.GoodMapper;

@Service("goodService")
public class GoodServiceImpl implements GoodService {

	
	/**
	 * ×Ô¶¯×¢ÈëGoodMapper
	 */
	@Autowired
	private GoodMapper goodMapper;
	@Override
	public void addGood( String good_name, String good_num,Integer price, String catagory_sn,Integer count) {
		
		goodMapper.saveGood(good_name,good_num,price,catagory_sn, count);

	}
	
	

	@Override
	public void changeGood( String good_name, String good_num,Integer price, String catagory_sn,Integer count) {
		
		goodMapper.updateGood(good_name,good_num,price,catagory_sn,count);

	}
	
	@Override
	public void deleteGood( String good_name, String good_num,Integer price, String catagory_sn,Integer count) {
		
		goodMapper.removeGood(good_name,good_num,price,catagory_sn,count);

	}
}
