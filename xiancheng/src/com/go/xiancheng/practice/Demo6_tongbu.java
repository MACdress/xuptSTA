package com.go.xiancheng.practice;

public class Demo6_tongbu implements Runnable {
	private final Tittle t = new Tittle();

	public static void main(String[] args) {
		Demo6_tongbu d6 = new Demo6_tongbu();
		Thread t1 = new Thread(d6);
		Thread t2 = new Thread(d6);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.add(Thread.currentThread().getName());
	}
}

class Tittle {
	public static int num = 0;

	public synchronized void add(String s) {
		num++;
		System.out.println(s + "你是第" + num + "个执行的");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			return;
		}
	}
}