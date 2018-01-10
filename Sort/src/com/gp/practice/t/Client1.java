package com.gp.practice.t;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {
	private static InputStream is = null;
	private static OutputStream os = null;

	public static void main(String[] args) {
		try {
			Socket s = new Socket("127.0.0.1", 8888);
			is = s.getInputStream();
			os = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			DataInputStream dis = new DataInputStream(is);
			dos.writeUTF("hey");
			// dos.flush();
			String s1 = null;
			if ((s1 = dis.readUTF()) != null) {
				System.out.println(s1);
				System.out.println("IP：" + s.getInetAddress());
				System.out.println("端口:" + s.getPort());
			}
			dos.close();
			dis.close();
			s.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("客户端程序出现错误");
		}
	}
}
