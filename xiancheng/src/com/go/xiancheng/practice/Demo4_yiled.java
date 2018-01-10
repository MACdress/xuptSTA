package com.go.xiancheng.practice;

public class Demo4_yiled {
	public static void main(String[] args) {
		Thread4 t1 = new Thread4("t1");
		Thread4 t2 = new Thread4("t2");
		t1.start();
		t2.start();
	}
}

class Thread4 extends Thread {
	public Thread4(String s1) {
		super(s1);
	}

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println(super.getName() + "  " + i);
			if (i % 10 == 0) {
				Thread.yield();
			}
		}
	}
}