package com.xupt.javaSM;

public class UseMarket {
	public void kuCun(MarketSql ms) {// չʾ��Ʒ��Ϣ
		ms.showsSql();
	}

	public void sell(Customer use, MarketSql ms) {// ������Ʒ����
		GetAnswer ga = new GetAnswer();
		String name;
		Market ma = null;
		int num;
		double value = 0;
		while (true) {
			System.out.println("������Ҫ�������Ʒ������#��������");
			name = ga.getString2();
			if ((name.equals("#"))) {
				System.out.println("лл����ӭ�´ι���");
				break;
			}
			if (ms.findGoods(name.trim())) {
				ma = ms.getGoods(name.trim());
				System.out.println("������Ҫ���������");
				num = ga.getInt1();
				if (num <= (ma.getNum())) {
					ms.changeMarketNum(name, (ma.getNum() - num));
					value = num * ma.getValue();
					use.setPurchaseInformation(name, num, value);
				}
			} else {
				System.out.println("û������Ҫ����Ʒ");
			}
		}
	}

	public void jieYu(Customer use) {// ����Ĺ���
		GetAnswer ga = new GetAnswer();
		int num = use.getno();
		double values = 0, money = 0;
		System.out.println("���Ĺ�������Ϊ��");
		System.out.println("��������" + "     " + "����" + "     " + "�۸�");
		for (int i = 0; i < num; i++) {
			UserPurchaseInformation temp;
			temp = use.getInformation(i);
			System.out.println(temp.getName() + "     " + temp.getNum()
					+ "     " + temp.getValue());
			values += temp.getValue();
		}
		System.out.println("��Ӧ��" + values + "Ԫ");
		while (true) {
			money = ga.getDouble();
			System.out.println("����" + money + "Ԫ");
			if (money < values) {
				values -= money;
				money = 0;
				System.out.println("������֧��" + values + "Ԫ");
			} else {
				if (money > values) {
					System.out.println("����" + (money - values) + "Ԫ");
				}
				System.out.println("лл�ݹˣ��������´ι��٣�");
				break;
			}
		}
	}
}
