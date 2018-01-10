package com.xupt.javaSM;

public class Administration extends User {
	public String GetMyId() {
		String id1;
		int id = (int) (Math.random() * 1000 + 1000);
		id1 = String.valueOf(id);
		super.setId(id1);
		return id1;
	}
}
