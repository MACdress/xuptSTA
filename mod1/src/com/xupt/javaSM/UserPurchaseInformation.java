package com.xupt.javaSM;

public class UserPurchaseInformation {
	private final String name;
	private final int num;
	private final double value;

	public UserPurchaseInformation() {
		this.num = 0;
		this.name = null;
		this.value = 0;
	}

	public UserPurchaseInformation(String name, int num, double value) {
		this.num = num;
		this.value = value;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getNum() {
		return num;
	}

	public double getValue() {
		return value;
	}

}
