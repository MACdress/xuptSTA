package com.xupt.javaSM;

public class JinHuo {
	public void GetGoods(MarketSql ms) {
		GetAnswer ga = new GetAnswer();
		do {
			System.out.println("��������Ҫ����������");
			String name = ga.getString2();
			System.out.println("���������������");
			int num = ga.getInt1();
			while (num == 0) {
				System.out.println("������������Ϊ��");
				num = ga.getInt1();
			}
			if (ms.findGoods(name)) {
				ms.changeMarketNum(name, num);
			} else {
				System.out.println("�����뵥�ۣ�");
				double value = ga.getDouble();
				ms.setMarketInformation(name, value, num);
			}
			System.out.println("�����Ƿ����������Y/N");
			Character tag = ga.getChar();
			if (tag.equals('n') || tag.equals('N')) {
				break;
			}
		} while (true);
	}
}
