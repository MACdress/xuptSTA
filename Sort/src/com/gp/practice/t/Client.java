package com.gp.practice.t;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException,
			IOException, InterruptedException {
		String ip = "127.0.0.1";// Ҫ���ӵ�Ip��ַ
		int p_num = 6666;// Ҫ���ӵĶ˿�
		Socket s = new Socket(ip, p_num);// client��server��������;client�Ķ˿ڣ�ϵͳ���ѡһ������������
		// ����ͻ��˿�������һ��Server���ȴ�Server���ܡ���ʱ��s����client��server�˽�����һ���ܵ���
		// ͨ���ܵ������������ݴ��䣨���ӹܵ�����������ܵ�������ܵ���
		OutputStream os = s.getOutputStream();// clientһ��������������������ܵ���
		DataOutputStream dos = new DataOutputStream(os);
		Thread.sleep(3000);
		// dos.writeUTF("HELLO SERVER");// ������������һ�仰����UTF-8����ʽд��һ�仰
		dos.flush();
		dos.close();
		s.close();// s����Ҳ��һ���ܵ���Ҳ��Ҫ�رա�
	}
}
