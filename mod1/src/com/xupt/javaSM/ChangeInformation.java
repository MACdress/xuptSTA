package com.xupt.javaSM;

public class ChangeInformation {
	public void getInformationOfName(User cus, MySql mysql) {// ������Ϣ
		GetAnswer ga = new GetAnswer();
		String name = null;
		int flag = 0;
		do {
			if (flag == 0) {
				System.out.println("��������Ҫ���ĵ�����");
				name = ga.getString2();
				flag = 1;
			} else {
				System.out.println("��������û��������Ѿ�ע���������������");
			}
		} while (mysql.judge(name) == false);
		cus.setName(name);
		System.out.println("���Ժ�.....�����޸�.....");
		System.out.println("�޸ĳɹ�");
	}

	public void getInformationPassword(User cs, MySql mysql) {
		int flag = 0;
		GetAnswer ga = new GetAnswer();
		String passward = null, temp;
		do {// ��������Ĺ���
			if (flag == 0) {
				System.out.println("������ԭ����");
			} else {
				System.out.println("���ٴ�����ԭ����:");
			}
			passward = ga.getString(6);// �޷��ж�����������Ƿ��в��Ϸ��ַ�
		} while (cs.judgePassward(passward) == false);
		flag = 0;
		do {// ��������Ĺ���
			if (flag == 0) {
				System.out.println("������������:(**��ʽΪ��λ����");
				passward = ga.getString(6);// �޷��ж�����������Ƿ��в��Ϸ��ַ�
				System.err.println("���ٴ���������");
				temp = ga.getString(6);
				flag = 1;
			} else {
				System.out.println("������������벻һ�£��������������룺");
				passward = ga.getString(6);
				System.err.println("���ٴ���������");
				temp = ga.getString(6);
			}
		} while (temp.equals(passward) != true);
		cs.setPassward(passward);
		System.out.println("���Ժ�.....�����޸�.....");
		System.out.println("�޸ĳɹ�");
	}
}
