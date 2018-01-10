package com.xupt.javaSM;

public class Customer extends User {
	private final UserPurchaseInformation[] up;
	private int no;

	public Customer() {
		super();
		up = new UserPurchaseInformation[1000];
		this.no = 0;
	}

	public String GetMyId() {
		String id1;
		int id = (int) (Math.random() * 100000 + 100000);
		id1 = String.valueOf(id);
		super.setId(id1);
		return id1;
	}

	public int getno() {// 返回交易信息条数
		return no;
	}

	public UserPurchaseInformation getInformation(int id) {// 返回交易信息详情
		return up[id];
	}

	public void setPurchaseInformation(String name, int num, double value) {// 加载购买商品的信息
		UserPurchaseInformation temp = new UserPurchaseInformation(name, num,
				value);
		up[no++] = temp;
	}

}
