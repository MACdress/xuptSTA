package com.xupt.javaSM;

public class User {

	private String name;
	private String passward;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String id;
	private String ShenFenZheng;

	public User() {
		this.id = this.name = this.passward = this.ShenFenZheng = "0";
	}

	public String setInformation(String passward, String name,
			String shenfenzheng) {// 对个人信息进行初始化
		int id = (int) (Math.random() * 100000 + 100000);
		this.id = String.valueOf(id);
		this.passward = passward;
		this.name = name;
		this.ShenFenZheng = shenfenzheng;
		return this.id;
	}

	public boolean judgeIogin(String id, String passward) {// 判断是否可以登录
		if (this.id.equals(id) && this.passward.equals(passward)) {
			return true;
		}
		return false;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}

	public boolean judgePassward(String temp) {// 获得密码
		if (passward.equals(temp)) {
			return true;
		}
		return false;
	}

	public String getName() {// 获得用户名
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean judge(String id) {// 判断id是否有人注册过
		if (this.id.equals(id)) {
			return true;
		}
		return false;
	}

	public boolean judge1(String name) {// 判断是否有相同的用户名
		if (this.name.equals(name)) {
			return true;
		}
		return false;
	}

	public boolean judge2(String shenfengzheng) {// 判断身份证是否有人使用过
		if (this.ShenFenZheng.equals(shenfengzheng)) {
			return true;// 有人注册过
		}
		return false;// 没有人注册过
	}

}
