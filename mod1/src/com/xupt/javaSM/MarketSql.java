package com.xupt.javaSM;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

public class MarketSql {
	private final Map<String, Market> goods = new HashMap<String, Market>();
	private final String id;// 商品的编号

	public MarketSql() {// 初始化
		Connection con = Unitue1.open();
		String sql="create table Marketgoods(goods_no  int(6) primary_key auto_increment,"
		goods.put("1", new Market("牙膏", 5.3, 15));
		goods.put("2", new Market("面包", 4, 20));
		goods.put("3", new Market("可口可乐", 5.3, 15));
		goods.put("4", new Market("洗衣粉", 7, 20));
		goods.put("5", new Market("薯片", 3, 25));
		this.id = "5";
	}

	public void setMarketInformation(Market good) {// 进货
		if (this.goods.containsValue(good)) {
			System.out.println("请输入商品的id:");
		}

	}

	public boolean changeMarketValue(String id, double value) {// 改变指定商品的价值
		if (this.goods.containsKey(id)) {
			Market temp = this.goods.get(id);
			temp.setValue(value);
			return true;
		}
		return false;
	}

	public void Print() {// 输出本商店中有哪些商品

	}

	public Market getGoods(String id) {// 返回对应的货物信息

		return goods.get(id);
	}

	public boolean findGoods(String name) {// 是否可以找到货物
		if (this.goods.containsValue(name)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean delete(String id) {// 商品下架
		if (this.goods.containsKey(id)) {
			this.goods.remove(id);
			return true;
		} else {
			return false;
		}
	}
}
