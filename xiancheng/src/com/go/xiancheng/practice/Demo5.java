package com.go.xiancheng.practice;

public class Demo5 {
	public static void main(String[] args) {
		Thread t3 = new Thread(new Thread3());
		Thread t2 = new Thread(new Thread2());
		t3.setPriority(Thread.NORM_PRIORITY + 3);
		t3.start();
		t2.start();
	}
}

class Thread3 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			System.out.println("T3:" + i);
		}
	}

	public void start() {
		// TODO Auto-generated method stub

	}
}

class Thread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			System.out.println("--------T2:" + i);
		}
	}

	public void start() {
		// TODO Auto-generated method stub

	}
}