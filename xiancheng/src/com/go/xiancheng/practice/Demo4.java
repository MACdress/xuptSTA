package com.go.xiancheng.practice;

public class Demo4 {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1("abcdr");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello,World");
		}
	}
}

class Thread1 extends Thread {
	public Thread1(String s) {
		super(s);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(super.getName());
		}
		try {
			sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			return;
		}
	}

}
