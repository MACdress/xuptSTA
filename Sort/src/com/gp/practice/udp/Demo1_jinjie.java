package com.gp.practice.udp;

import java.io.File;
import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Demo1_jinjie {
	// @SuppressWarnings("deprecation")
	public static void main(String[] args) {
		DatagramSocket ds = null;
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		try {
			ds = new DatagramSocket(3096);
			while (true) {
				ds.receive(dp);
				String s = new String(dp.getData(), 0, dp.getLength());
				System.out.println(s);
				// ByteArrayInputStream ba = new ByteArrayInputStream(buf);

				// DataInputStream dis = new DataInputStream(ba);

				FileOutputStream fis = new FileOutputStream(new File(
						"e:/copy/copy.txt"));
				// byte[] buffer = new byte[1024];
				// int len = -1;
				fis.write(s.getBytes());
				// BufferedOutputStream bos = new BufferedOutputStream(fis);
				// byte[] temp = new byte[1024];

				// bos.write(s.getBytes());
				// System.out.println(Double.valueOf((String.valueOf(dis.readLine()))));
				// System.out.println(dis.read(dp.getData(), 0,
				// dp.getLength()));
				fis.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据接收过程出现错误");
		} finally {
			if (ds != null) {
				ds.close();
			}
		}
	}
}
