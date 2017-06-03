package com.jbit.goodsservice;

import java.util.List;

import com.jbit.entity.Goods;

public interface GoodsService {
	public Goods districtQuery(Goods goods);
	public  void updateGoods(Goods goods);
	public Goods getByGoodsId(int id);
	public List<Goods> getGoodsAll(Goods goods);

}
