package com.xupt.javaSM;

public class MySql {
	private final User[] user;
	private int num;

	public MySql() {
		num = 0;
		user = new User[1000];
	}

	public void setUser(User user1) {
		user[num++] = user1;
	}

	public boolean judge(String name) {// �жϸ����������Ƿ����
		int i;
		for (i = 0; i < num; i++) {
			if (user[i].judge1(name)) {
				return false;
			}
		}
		return true;
	}

	public boolean judge3(String shenfen) {// �ж������ע����˺�
		int i;
		for (i = 0; i < num; i++) {
			if (user[i].judge2(shenfen)) {
				return false;
			}
		}
		return true;
	}

	public boolean judge2(String id) {// �ж��Ƿ����ע�᣿
		int i;
		for (i = 0; i < num; i++) {
			if (user[i].judge(id)) {
				return true;// ����ע���
			}
		}
		return false;// û����ע���
	}

	public User find(String shenfen) {// �жϸ����֤�Ƿ�ע���
		int i;
		for (i = 0; i < num; i++) {
			if (user[i].judge2(shenfen)) {
				return user[i];
			}
		}
		return null;
	}
}
