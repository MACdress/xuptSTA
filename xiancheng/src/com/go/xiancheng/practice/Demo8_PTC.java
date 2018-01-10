package com.go.xiancheng.practice;

public class Demo8_PTC {// Producers to consumers
	public static void main(String[] args) {
		SynStack ss = new SynStack();
		Customer c = new Customer(ss);
		Procedure p = new Procedure(ss);
		new Thread(c).start();
		new Thread(p).start();
	}
}

class ManTou {// 馒头
	private final int id;

	public ManTou(int i) {
		this.id = i;
	}

	@Override
	public String toString() {
		return "MouTou" + id;
	}

}

class SynStack {// 篮子
	private final ManTou[] ss = new ManTou[6];
	private int index = 0;

	public synchronized void push(ManTou m) {
		while (index == 6) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("篮子满了");
			}
		}
		this.notifyAll();
		ss[index] = m;
		index++;
	}

	public synchronized ManTou pop() {
		while (index == 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("篮子空了！");
			}
		}
		this.notifyAll();
		index--;
		return ss[index];
	}
}

class Procedure implements Runnable {
	private SynStack ss = null;

	public Procedure(SynStack ss) {
		this.ss = ss;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			ManTou mt = new ManTou(i);
			System.out.println("生产了" + mt);
			ss.push(mt);
			try {
				Thread.sleep((int) (Math.random() * 200));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Customer implements Runnable {
	private SynStack ss = null;

	public Customer(SynStack ss) {
		this.ss = ss;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			ManTou mt = ss.pop();
			System.out.println("消费了" + mt);
			try {
				Thread.sleep((int) (Math.random() * 200));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}