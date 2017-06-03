package com.jbit.goodsservice.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.jbit.Goodsdao.GoodsDao;
import com.jbit.entity.Goods;
import com.jbit.goodsservice.GoodsService;

public class GoodsServiceImpl implements GoodsService{
	private	GoodsDao dao ;

	public GoodsDao getDao() {
		return dao;
	}

	public void setDao(GoodsDao dao) {
		this.dao = dao;
	}

	@Override
	public Goods districtQuery(Goods goods) {
		// TODO Auto-generated method stub
		return (Goods) dao.findByHql("from goods where goodsDistrict = "+goods.getGoodsdistrict());
	}

	@Override
	public Goods getByGoodsId(int id) {
		
		return dao.findById(id);
	}

	@Override
	public List<Goods> getGoodsAll(Goods goods) {
		
		return dao.findAll();
	}

	@Override
	public void updateGoods(Goods goods) {
		 goods =dao.findById(goods.getId());
		 dao.update(goods);
		
	}



	

	

	


}
