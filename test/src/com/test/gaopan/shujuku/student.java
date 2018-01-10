package com.test.gaopan.shujuku;

public class student {
	private int s_no;
	private String s_name;
	private int age;
	private String sex;

	public int getS_no() {
		return s_no;
	}

	public void setS_no(int s_no) {
		this.s_no = s_no;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "student [s_no=" + s_no + ", s_name=" + s_name + ", age=" + age
				+ ", sex=" + sex + "]";
	}

}
