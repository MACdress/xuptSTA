package com.gp.practice.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class Demo2 {
	public static void main(String[] args) {
		String s = "Hello,World";
		byte[] bs = s.getBytes();
		try {
			DatagramPacket dp = new DatagramPacket(bs, bs.length,
					new InetSocketAddress("127.0.0.1", 5678));
			DatagramSocket ds = new DatagramSocket(8888);
			ds.send(dp);
			ds.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("数据包发送失败");
		}
	}
}
