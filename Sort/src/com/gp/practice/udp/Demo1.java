package com.gp.practice.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Demo1 {
	public static void main(String[] args) {
		DatagramSocket ds = null;
		byte[] b = new byte[1024];// ����һ���ڴ�洢����
		DatagramPacket dp = new DatagramPacket(b, b.length);// ���һ�����ݰ���������
		try {
			ds = new DatagramSocket(5678);// ���ݰ�����ͨ��
			while (true) {
				ds.receive(dp);// ����ʽ�ķ���������һ�����ݰ�
				System.out.println(new String(b, 0, dp.getLength()));// getLength()����Ϊʵ���Ͻ����˶����ֽ�
				// ͨ���ֽ������һ���ֹ���string
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("���ݰ�����ʧ��");
		} finally {
			if (ds != null) {
				ds.close();
			}
		}
	}
}
