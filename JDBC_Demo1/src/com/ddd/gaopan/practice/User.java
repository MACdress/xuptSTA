package com.ddd.gaopan.practice;

public class User {
	private String username;
	private int id;
	private String sex;
	private String password;

	public String getUsername() {
		return username;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", id=" + id + ", sex=" + sex
				+ ", password=" + password + "]";
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
