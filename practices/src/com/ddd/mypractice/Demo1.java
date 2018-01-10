package com.ddd.mypractice;

public class Demo1 {
	public static void main(String[] args) {
		kidcircle a = new kidcircle(500);
		kid temp;
		int i = 1;
		temp = a.begin;
		while (a.count > 1) {
			temp = temp.right;
			i++;
			if (i == 3) {
				i = 1;
				temp = temp.right;
				a.delete(temp.left);
			}
		}
		System.out.println(a.begin.id);
	}
}

class kid {
	int id;
	kid left, right;

	public kid(int id) {
		this.id = id;
	}
}

class kidcircle {
	int count;
	kid begin, end;

	public kidcircle(int n) {
		if (n < 0) {
			System.out.println("输入数据有误，不能构成一个环！");
			return;
		}
		this.count = n;
		int tag = 0;
		kid temp;
		for (int i = 0; i < n; i++) {
			temp = new kid(i + 1);
			if (tag == 0) {
				this.end = this.begin = temp;
				this.begin.left = this.begin.right = this.begin;
				this.end.left = this.end.right = this.end;
				tag = 1;
			} else {
				this.end.right = temp;
				temp.left = this.end;
				this.end = temp;
			}
		}
		if (tag != 0) {
			this.end.right = this.begin;
			this.begin.left = this.end;
		}
	}

	public void add() {
		kid temp = new kid(this.count + 1);
		if (this.count <= 0) {
			this.count = 1;
			this.begin.left = this.begin.right = this.end.left = this.end.right = this.end = this.begin = temp;
		} else {
			this.end.right = temp;
			temp.left = this.end;
			this.end = temp;
			this.end.right = this.begin;
			this.begin.left = this.end;
			this.count++;
		}
	}

	public void delete(kid k) {
		if (this.count <= 0) {
			System.out.println("已经没有小孩了！");
			return;
		} else if (this.count == 1) {
			this.end = this.begin = null;
			this.count = 0;
		} else {
			k.left.right = k.right;
			k.right.left = k.left;
			if (k == this.begin) {
				this.begin = k.right;
			} else if (k == this.end) {
				this.end = k.left;
			}
			this.count--;
		}
	}
}