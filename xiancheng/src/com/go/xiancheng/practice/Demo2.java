package com.go.xiancheng.practice;

public class Demo2 {
	public static void main(String[] args) {
		MyRunner1 mr = new MyRunner1();
		mr.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread1:" + i);
		}
	}
}

class MyRunner1 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println("Runner1:" + i);
		}
	}

}