package com.zhuzhiguang.goods.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageInfo;
import com.zhuzhiguang.goods.dao.GoodsMapper;
import com.zhuzhiguang.goods.entity.Goods;

/**
 * 
 * @author zhuzg
 *
 */
@Service(interfaceClass=GoodsService.class)
@Transactional
public class GoodsServiceImpl  implements GoodsService{
	
	@Autowired
	GoodsMapper goodsMapper;
	
	public int create(Goods goods) {
		
	}
	
	public int deleteById(Integer id) {
		
	}
	public int deleteBatch(Integer[] ids) {
		
	}
	
	public int update(Goods goods) {
		
	}
	
	public Goods findById(Integer id) {
		
	}
	
	public  PageInfo<Goods> list(int pageNum,int pageSize){
		
	}

}
