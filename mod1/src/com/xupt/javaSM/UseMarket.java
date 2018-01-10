package com.xupt.javaSM;

public class UseMarket {
	public void kuCun(MarketSql ms) {// 展示商品信息
		ms.showsSql();
	}

	public void sell(Customer use, MarketSql ms) {// 购买商品过程
		GetAnswer ga = new GetAnswer();
		String name;
		Market ma = null;
		int num;
		double value = 0;
		while (true) {
			System.out.println("请输入要购买的商品，输入#结束购买");
			name = ga.getString2();
			if ((name.equals("#"))) {
				System.out.println("谢谢，欢迎下次购买：");
				break;
			}
			if (ms.findGoods(name.trim())) {
				ma = ms.getGoods(name.trim());
				System.out.println("请输入要购买的数量");
				num = ga.getInt1();
				if (num <= (ma.getNum())) {
					ms.changeMarketNum(name, (ma.getNum() - num));
					value = num * ma.getValue();
					use.setPurchaseInformation(name, num, value);
				}
			} else {
				System.out.println("没有你需要的商品");
			}
		}
	}

	public void jieYu(Customer use) {// 结余的过程
		GetAnswer ga = new GetAnswer();
		int num = use.getno();
		double values = 0, money = 0;
		System.out.println("您的购物详情为：");
		System.out.println("货物名称" + "     " + "数量" + "     " + "价格");
		for (int i = 0; i < num; i++) {
			UserPurchaseInformation temp;
			temp = use.getInformation(i);
			System.out.println(temp.getName() + "     " + temp.getNum()
					+ "     " + temp.getValue());
			values += temp.getValue();
		}
		System.out.println("您应付" + values + "元");
		while (true) {
			money = ga.getDouble();
			System.out.println("收您" + money + "元");
			if (money < values) {
				values -= money;
				money = 0;
				System.out.println("您还需支付" + values + "元");
			} else {
				if (money > values) {
					System.out.println("找您" + (money - values) + "元");
				}
				System.out.println("谢谢惠顾，欢饮您下次光临！");
				break;
			}
		}
	}
}
