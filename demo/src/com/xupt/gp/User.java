package com.xupt.gp;

public class User {
	private String username;
	private String psw;
	private String sex;
	private String hobby;
	private String city;

	@Override
	public String toString() {
		return "User [username=" + username + ", psw=" + psw + ", sex=" + sex + ", hobby=" + hobby + ", city=" + city
				+ "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
