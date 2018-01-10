package com.gp.practice.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class Demo2_jinjie {
	public static void main(String[] args) {
		int b = 1234;
		String bs = String.valueOf(b);
		byte[] bs2 = bs.getBytes();
		// String s1 = String.valueOf(bs2);
		// Long l2 = Long.valueOf(bs);
		// System.out.println(l2);
		// System.out.println(String.valueOf(buf));
		try {
			DatagramPacket dp = new DatagramPacket(bs2, bs2.length,
					new InetSocketAddress("127.0.0.1", 3096));
			DatagramSocket ds = new DatagramSocket(5278);
			ds.send(dp);
			ds.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("发送过程出现错误");
		}
	}
}
