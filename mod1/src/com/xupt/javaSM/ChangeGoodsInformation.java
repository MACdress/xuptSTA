package com.xupt.javaSM;

public class ChangeGoodsInformation {
	public void Change1(MarketSql ms) {// �޸���Ʒ�۸�
		GetAnswer ga = new GetAnswer();
		do {
			System.out.println("������Ҫ����۸����Ʒ");
			String name = ga.getString2();
			System.out.println("������Ĺ���ļ۸�:");
			System.out.println("�����뵥�ۣ�");
			double value = ga.getDouble();
			ms.changeMarketValue(name, value);
			System.out.println("�����Ƿ�����޸ģ�Y/N");
			Character tag = ga.getChar();
			if ((tag == 'N') || (tag == 'n')) {
				break;
			}
		} while (true);
	}
}
