package com.gaopan.lianbiao;

//类似于约瑟夫环
public class LianBiao {
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
		this.count = 0;
		for (int i = 0; i < n; i++) {
			add();

		}
	}

	public void add() {
		kid temp = new kid(this.count + 1);
		if (this.count <= 0) {
			this.count = 1;
			this.end = this.begin = temp;
			this.begin.left = this.begin.right = this.begin;
			this.end.left = this.end.right = this.end;
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