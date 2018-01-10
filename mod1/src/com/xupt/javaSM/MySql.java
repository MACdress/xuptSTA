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

	public boolean judge(String name) {// 判断该人物名称是否存在
		int i;
		for (i = 0; i < num; i++) {
			if (user[i].judge1(name)) {
				return false;
			}
		}
		return true;
	}

	public boolean judge3(String shenfen) {// 判断这个人注册过账号
		int i;
		for (i = 0; i < num; i++) {
			if (user[i].judge2(shenfen)) {
				return false;
			}
		}
		return true;
	}

	public boolean judge2(String id) {// 判断是否进行注册？
		int i;
		for (i = 0; i < num; i++) {
			if (user[i].judge(id)) {
				return true;// 有人注册过
			}
		}
		return false;// 没有人注册过
	}

	public User find(String shenfen) {// 判断该身份证是否注册过
		int i;
		for (i = 0; i < num; i++) {
			if (user[i].judge2(shenfen)) {
				return user[i];
			}
		}
		return null;
	}
}
