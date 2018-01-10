package com.go.xiancheng.practice;

public class Demo6_DeadBlock implements Runnable {
	private int flag = 1;
	private final static Object o1 = new Object();
	private final static Object o2 = new Object();

	@Override
	public void run() {
		System.out.println("flag=" + flag);
		// TODO Auto-generated method stub
		if (flag == 1) {
			synchronized (o1) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (o2) {
					System.out.println(1);
				}
			}
		}
		if (flag == 0) {
			synchronized (o2) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (o1) {
					System.out.println(0);
				}
			}
		}
	}

	public static void main(String[] args) {
		Demo6_DeadBlock d61 = new Demo6_DeadBlock();
		Demo6_DeadBlock d62 = new Demo6_DeadBlock();
		d61.flag = 1;
		d62.flag = 0;
		Thread t1 = new Thread(d61);
		Thread t2 = new Thread(d62);
		t1.start();
		t2.start();
	}
}