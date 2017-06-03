package com.jbit.action;

import java.util.List;

import com.jbit.base.BaseAction;
import com.jbit.entity.Goods;
import com.jbit.goodsservice.GoodsService;

public class GoodsAction extends BaseAction{
	private GoodsService service;
	private List<Goods> list;
	private Goods goods;
	private String str;
	private  int Type;
	public GoodsService getService() {
		return service;
	}
	public void setService(GoodsService service) {
		this.service = service;
	}
	public List<Goods> getList() {
		return list;
	}
	public void setList(List<Goods> list) {
		this.list = list;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public int getType() {
		return Type;
	}
	public void setType(int type) {
		Type = type;
	}
	public String getGoodsAll(){
		try {
			if(goods==null){
				goods=new Goods();
				
			}
			list=service.getGoodsAll(goods);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			goods=null;
		}
		return "success";
		
		
	}
}
