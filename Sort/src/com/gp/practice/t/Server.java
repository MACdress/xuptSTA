package com.gp.practice.t;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//������SERVER����дCLIENT��д��ʱ��һ��дSERVER��һ��дCLIENT
public class Server {
	public static void main(String[] args) throws IOException {
		int p_num = 6666;// �˿ںţ�ͨ���ĸ��˿ڼ����ͻ�������
		ServerSocket ss = new ServerSocket(p_num);// ������ʽ�ģ��ȴ�Client���ӡ�֮��дclient,�ö˿��Ա�ռ��
		while (true) {
			Socket s = ss.accept();// ��������,��������ܣ���client��Server�����ӽ��������������sר�ź�client�����ӣ���ר�ź�client�е�Socket�����ӡ�
			// System.out.println("A ���� �ɹ�");
			// s�ǿͻ�������ܵ�
			InputStream is = s.getInputStream();// �������ܵ��������client������ܵ���
			DataInputStream dis = new DataInputStream(is);
			System.out.println(dis.readUTF());// ����ʽ�ģ������д����������Ҳ�ڵ��š�
			dis.close();
			s.close();
			ss.close();
		}
	}
}
