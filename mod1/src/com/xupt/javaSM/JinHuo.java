package com.xupt.javaSM;

public class JinHuo {
	public void GetGoods(MarketSql ms) {
		GetAnswer ga = new GetAnswer();
		do {
			System.out.println("请输入您要进货的名称");
			String name = ga.getString2();
			System.out.println("请输入进货的数量");
			int num = ga.getInt1();
			while (num == 0) {
				System.out.println("货物数量不能为零");
				num = ga.getInt1();
			}
			if (ms.findGoods(name)) {
				ms.changeMarketNum(name, num);
			} else {
				System.out.println("请输入单价：");
				double value = ga.getDouble();
				ms.setMarketInformation(name, value, num);
			}
			System.out.println("请问是否继续进货？Y/N");
			Character tag = ga.getChar();
			if (tag.equals('n') || tag.equals('N')) {
				break;
			}
		} while (true);
	}
}
