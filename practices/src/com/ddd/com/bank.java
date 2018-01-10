package com.ddd.com;

import java.io.Serializable;

public class bank implements Serializable {

	private static final long serialVersionUID = 1L;
	private int balance = 1000;

	public int getBalance() {
		return balance;
	}

	public void draw(int money) {// draw---È¡¿î
		this.balance = this.balance - money;
	}
}
