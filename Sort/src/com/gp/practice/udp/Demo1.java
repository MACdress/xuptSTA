package com.gp.practice.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Demo1 {
	public static void main(String[] args) {
		DatagramSocket ds = null;
		byte[] b = new byte[1024];// 定义一个内存存储数据
		DatagramPacket dp = new DatagramPacket(b, b.length);// 变成一个数据包接收数据
		try {
			ds = new DatagramSocket(5678);// 数据包接收通道
			while (true) {
				ds.receive(dp);// 阻塞式的方法。接收一个数据包
				System.out.println(new String(b, 0, dp.getLength()));// getLength()方法为实际上接收了多少字节
				// 通过字节数组的一部分构建string
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据包接收失败");
		} finally {
			if (ds != null) {
				ds.close();
			}
		}
	}
}
