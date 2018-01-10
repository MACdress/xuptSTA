package com.xupt.javaSM;

public class ChangeInformation {
	public void getInformationOfName(User cus, MySql mysql) {// 更改信息
		GetAnswer ga = new GetAnswer();
		String name = null;
		int flag = 0;
		do {
			if (flag == 0) {
				System.out.println("请输入你要更改的名字");
				name = ga.getString2();
				flag = 1;
			} else {
				System.out.println("您输入的用户名有人已经注册过，请重新输入");
			}
		} while (mysql.judge(name) == false);
		cus.setName(name);
		System.out.println("请稍后.....正在修改.....");
		System.out.println("修改成功");
	}

	public void getInformationPassword(User cs, MySql mysql) {
		int flag = 0;
		GetAnswer ga = new GetAnswer();
		String passward = null, temp;
		do {// 输入密码的过程
			if (flag == 0) {
				System.out.println("请输入原密码");
			} else {
				System.out.println("请再次输入原密码:");
			}
			passward = ga.getString(6);// 无法判断输入的密码是否有不合法字符
		} while (cs.judgePassward(passward) == false);
		flag = 0;
		do {// 输入密码的过程
			if (flag == 0) {
				System.out.println("请输入新密码:(**格式为六位数字");
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
		cs.setPassward(passward);
		System.out.println("请稍后.....正在修改.....");
		System.out.println("修改成功");
	}
}
