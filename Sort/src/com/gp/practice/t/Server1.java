package com.gp.practice.t;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	private static InputStream is = null;
	private static OutputStream os = null;

	public static void main(String[] args) {
		int p_num = 8888;
		try {
			ServerSocket ss = new ServerSocket(p_num);
			Socket s = ss.accept();
			os = s.getOutputStream();
			is = s.getInputStream();
			DataOutputStream dos = new DataOutputStream(os);
			DataInputStream dis = new DataInputStream(is);
			String s1 = null;
			if ((s1 = dis.readUTF()) != null) {
				System.out.println(s1 + "     ");
				System.out.println("IP：" + s.getInetAddress());
				System.out.println(s1 + "     ");
				System.out.println("端口:" + s.getPort());
			}
			dos.writeUTF("h1,hello");
			// dos.flush();
			dos.close();
			s.close();
			ss.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("服务端程序出现错误");
		} finally {
		}
	}
}
