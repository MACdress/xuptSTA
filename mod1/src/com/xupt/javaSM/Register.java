package com.xupt.javaSM;

public class Register {
	public User register(MySql mysql, int i) {// ע�����
		GetAnswer ga = new GetAnswer();
		User use = null;
		if (i == 1) {
			use = new Customer();
		} else {
			use = new Administration();
		}
		int flag = 0;// �����ж��Ƿ����ڴ��������Ϣ��
		String temp = null, username, passward = null, id1 = null;
		do {
			if (flag == 0) {// ������Ϣ�Ĺ���
				System.out.println("����ע���û���������");
				System.out.println("������������");
				username = ga.getString2();// �޷��ж�������������Ƿ��в��Ϸ��ַ�
				flag = 1;
			} else {
				System.out.println("����������ע�ᣬ����������:");
				username = ga.getString2();
			}
		} while (mysql.judge(username.trim()) == false);
		flag = 0;
		do {// ��������Ĺ���
			if (flag == 0) {
				System.out.println("����������:(**��ʽΪ��λ����");
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
		System.out.println("���������֤���룺");
		String shengfenzheng = ga.getString(18);
		if (mysql.judge3(shengfenzheng) == false) {
			System.out.println("���Ѿ�ע������˺�,����е�¼��");
			return mysql.find(shengfenzheng);
		}
		use.setInformation(passward, username, shengfenzheng);
		if (i == 1) {
			id1 = ((Customer) use).GetMyId();
		} else {
			id1 = ((Administration) use).GetMyId();
		}
		System.out.println("ע��ɹ�! ����ID�ǣ�" + id1);
		mysql.setUser(use);
		return use;
	}
}
