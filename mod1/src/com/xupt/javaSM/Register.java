package com.xupt.javaSM;

public class Register {
	public User register(MySql mysql, int i) {// 注册过程
		GetAnswer ga = new GetAnswer();
		User use = null;
		if (i == 1) {
			use = new Customer();
		} else {
			use = new Administration();
		}
		int flag = 0;// 用来判断是否是在此输入的信息。
		String temp = null, username, passward = null, id1 = null;
		do {
			if (flag == 0) {// 输入信息的过程
				System.out.println("请先注册用户名及密码");
				System.out.println("请输入姓名：");
				username = ga.getString2();// 无法判断输入的名字中是否有不合法字符
				flag = 1;
			} else {
				System.out.println("该名称有人注册，请重新输入:");
				username = ga.getString2();
			}
		} while (mysql.judge(username.trim()) == false);
		flag = 0;
		do {// 输入密码的过程
			if (flag == 0) {
				System.out.println("请输入密码:(**格式为六位数字");
				passward = ga.getString(6);// 无法判断输入的密码是否有不合法字符
				System.err.println("请再次输入密码");
				temp = ga.getString(6);
				flag = 1;
			} else {
				System.out.println("两次输入的密码不一致，请重新输入密码：");
				passward = ga.getString(6);
				System.err.println("请再次输入密码");
				temp = ga.getString(6);
			}
		} while (temp.equals(passward) != true);
		System.out.println("请输入身份证号码：");
		String shengfenzheng = ga.getString(18);
		if (mysql.judge3(shengfenzheng) == false) {
			System.out.println("您已经注册过该账号,请进行登录：");
			return mysql.find(shengfenzheng);
		}
		use.setInformation(passward, username, shengfenzheng);
		if (i == 1) {
			id1 = ((Customer) use).GetMyId();
		} else {
			id1 = ((Administration) use).GetMyId();
		}
		System.out.println("注册成功! 您的ID是：" + id1);
		mysql.setUser(use);
		return use;
	}
}
