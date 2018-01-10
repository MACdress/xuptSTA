package com.xupt.javaSM;

public class YongHuJieMian {
	private final MySql mysql = new MySql();// ������Ϣ��
	private final MarketSql ms = new MarketSql();// ��Ʒ��Ϣ��
	private Customer user = null;

	private Administration as = null;

	public void firstJiemian() {// һ����ϵͳ�Ľ���
		int tag;
		GetAnswer ga = new GetAnswer();
		System.out.println("��ӭʹ����è��������ϵͳ��");
		System.out.println("��ѡ����Ҫ���еĲ���");
		do {
			System.out.println("1.��¼�˿͹������");
			System.out.println("2.ʹ�ù���Ա�˺ŵ�¼");
			System.out.println("3.ע���˻���");
			System.out.println("4.ע�����Ա");
			System.out.println("0.�˳�ϵͳ��");
			tag = ga.getInt1();
			tag = ga.getInt2(tag, 0, 4);
			switch (tag) {
			case 0:
				System.out.println("лл����ʹ�ã�");
				break;
			case 1:
				secondJieMian(1);
				break;
			case 2:
				secondJieMian(2);
				break;
			case 3:
				this.user = (Customer) ((new Register()).register(mysql, 1));
				break;
			case 4:
				this.as = (Administration) ((new Register()).register(mysql, 2));
			}
			if (tag == 0) {
				break;
			}
		} while (true);
	}

	public void secondJieMian(int tag1) {// �û���¼�Ľ���
		GetAnswer ga = new GetAnswer();
		int flag = 0, tag;
		User use;
		String id, passward;
		do {
			if (tag1 == 1) {
				if (user == null) {
					System.out.println("����δ���й�ע�ᣬ�뷵����һ�������ע��:");
					return;
				} else {
					use = user;
				}
			} else {
				if (as == null) {
					System.out.println("����δ���й�ע�ᣬ�뷵����һ�������ע��:");
					return;
				} else {
					use = as;
				}
			}
			System.out.println("������Ҫ�����Ĳ���");
			System.out.println("1.�����˺�����");
			System.out.println("0.������һ����棺");
			tag = ga.getInt1();
			tag = ga.getInt2(tag, 0, 1);
			if (tag == 0l) {
				break;
			}
			do {
				if (flag == 0) {
					System.out.println("�����������˺�");
				} else {
					System.out.println("�����������˺�");
				}
				id = ga.getString(6);

				flag = 1;
				if (mysql.judge2(id)) {
					break;
				}
			} while (true);

			System.out.println("��������������");
			passward = ga.getString2();
			System.out.println("��¼�У����Ժ�......");
			flag = 1;
			if (use.judgeIogin(id.trim(), passward.trim())) {
				System.out.println("��½�ɹ�����ӭʹ�ñ�ϵͳ��");
				if (use instanceof Customer) {
					marketJieMian();
				} else {
					administrationJieMian();
				}
			} else {
				System.out.println("��½ʧ�ܣ��˺Ż������벻��ȷ");
			}
		} while (true);
	}

	public void marketJieMian() {// ��¼֮��Ľ���
		GetAnswer ga = new GetAnswer();
		int tag;
		do {
			System.out.print("******************");
			System.out.print("������");
			System.out.println("******************");
			System.out.println("1���鿴��Ʒ���:");
			System.out.println("2��������Ʒ:");
			System.out.println("3����Ʒ��������:");
			System.out.println("4���޸��û���");
			System.out.println("5���޸�����");
			System.out.println("0���˳���¼");
			System.out.println("******************************************");
			tag = ga.getInt1();
			tag = ga.getInt2(tag, 0, 5);
			switch (tag) {
			case 1:
				new UseMarket().kuCun(ms);
				break;
			case 2:
				new UseMarket().sell(user, ms);
				break;
			case 3:
				new UseMarket().jieYu(user);
				break;
			case 4:
				new ChangeInformation().getInformationOfName(user, mysql);
				break;
			case 5:
				new ChangeInformation().getInformationPassword(user, mysql);
				break;
			case 0:
				break;
			}
			if (tag == 0) {
				break;
			}
		} while (true);
	}

	public void administrationJieMian() {
		GetAnswer ga = new GetAnswer();
		int tag;
		if (this.as == null) {
			System.out.println("����δ���й�ע�ᣬ�뷵����һ�������ע��:");
			return;
		}
		do {
			System.out.print("******************");
			System.out.print("������");
			System.out.println("******************");
			System.out.println("1���鿴��Ʒ���:");
			System.out.println("2������:");
			System.out.println("3����ѯ��������:");
			System.out.println("4���޸��û���");
			System.out.println("5���޸�����");
			System.out.println("6���޸Ļ�����Ϣ");
			System.out.println("0���˳���¼");
			System.out.println("******************************************");
			tag = ga.getInt1();
			tag = ga.getInt2(tag, 0, 6);
			switch (tag) {
			case 1:
				new UseMarket().kuCun(ms);
				break;
			case 2:
				new JinHuo().GetGoods(ms);
				break;
			case 3:
				new UseMarket().jieYu(user);
				break;
			case 4:
				new ChangeInformation().getInformationOfName(user, mysql);
				break;
			case 5:
				new ChangeInformation().getInformationPassword(user, mysql);
				break;
			case 6:
				new ChangeGoodsInformation().Change1(ms);
			case 0:
				break;
			}
			if (tag == 0) {
				break;
			}
		} while (true);
	}
}
