package com.go.xiancheng.practice;

import java.util.Date;

public class Demo3 {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// mt.flag = false;
			Thread.interrupted();
		}
	}
}

class MyThread implements Runnable {
	boolean flag = true;
	int i = 0;

	@Override
	public void run() {
		i++;
		// TODO Auto-generated method stub
		while (flag) {
			System.out.println("-----" + new Date() + "-----");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				return;
			}
		}
	}
}
