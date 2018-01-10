package com.go.xiancheng.practice;

public class Demo7_mianshi implements Runnable {
	private int b = 100;

	public static void main(String[] args) throws Exception {
		Demo7_mianshi d7 = new Demo7_mianshi();
		Thread t = new Thread(d7);
		t.start();
		// Thread.sleep(1000);
		d7.temp();
		System.out.println(d7.b);
	}

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		this.b = 1000;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("b=" + b);
	}

	public void temp() throws InterruptedException {
		b = 2000;
		Thread.sleep(9500);
		// System.out.println(b);
	}
}
