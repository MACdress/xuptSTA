package com.xupt.javaSM;

public class ChangeGoodsInformation {
	public void Change1(MarketSql ms) {// 修改商品价格
		GetAnswer ga = new GetAnswer();
		do {
			System.out.println("请输入要变更价格的商品");
			String name = ga.getString2();
			System.out.println("请输入改过后的价格:");
			System.out.println("请输入单价：");
			double value = ga.getDouble();
			ms.changeMarketValue(name, value);
			System.out.println("请问是否继续修改？Y/N");
			Character tag = ga.getChar();
			if ((tag == 'N') || (tag == 'n')) {
				break;
			}
		} while (true);
	}
}
