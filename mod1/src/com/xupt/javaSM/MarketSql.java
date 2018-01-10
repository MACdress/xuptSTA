package com.xupt.javaSM;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

public class MarketSql {
	private final Map<String, Market> goods = new HashMap<String, Market>();
	private final String id;// ��Ʒ�ı��

	public MarketSql() {// ��ʼ��
		Connection con = Unitue1.open();
		String sql="create table Marketgoods(goods_no  int(6) primary_key auto_increment,"
		goods.put("1", new Market("����", 5.3, 15));
		goods.put("2", new Market("���", 4, 20));
		goods.put("3", new Market("�ɿڿ���", 5.3, 15));
		goods.put("4", new Market("ϴ�·�", 7, 20));
		goods.put("5", new Market("��Ƭ", 3, 25));
		this.id = "5";
	}

	public void setMarketInformation(Market good) {// ����
		if (this.goods.containsValue(good)) {
			System.out.println("��������Ʒ��id:");
		}

	}

	public boolean changeMarketValue(String id, double value) {// �ı�ָ����Ʒ�ļ�ֵ
		if (this.goods.containsKey(id)) {
			Market temp = this.goods.get(id);
			temp.setValue(value);
			return true;
		}
		return false;
	}

	public void Print() {// ������̵�������Щ��Ʒ

	}

	public Market getGoods(String id) {// ���ض�Ӧ�Ļ�����Ϣ

		return goods.get(id);
	}

	public boolean findGoods(String name) {// �Ƿ�����ҵ�����
		if (this.goods.containsValue(name)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean delete(String id) {// ��Ʒ�¼�
		if (this.goods.containsKey(id)) {
			this.goods.remove(id);
			return true;
		} else {
			return false;
		}
	}
}
