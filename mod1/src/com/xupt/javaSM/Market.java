package com.xupt.javaSM;

public class Market {
	private String name;
	private double value;
	private int num;

	public Market() {
		this.name = null;
		this.value = 0;
		this.num = 0;
	}

	public Market(String name, double value, int num) {
		this.name = name;
		this.value = value;
		this.num = num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "   ，商品名称：  " + name + "   , 价格：  " + value + "    , 商品数量" + num;
	}
}
