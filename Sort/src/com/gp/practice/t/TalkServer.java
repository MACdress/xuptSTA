package com.gp.practice.t;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TalkServer {
	public static void main(String[] args) {
		int p_num = 1234;
		try {
			ServerSocket ss = new ServerSocket(p_num);
			Socket a = ss.accept();
			System.out.println("连接成功");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					a.getInputStream()));
			BufferedReader br2 = new BufferedReader(new InputStreamReader(
					System.in));
			PrintWriter pw = new PrintWriter(a.getOutputStream());
			System.out.println("Client:" + br.readLine());
			String s = null;
			s = br2.readLine();
			while (s.equals("bye") != true) {
				pw.println(s);
				pw.flush();
				System.out.println("Server:" + s);
				if (br.readLine() != null) {
					System.out.println("Client:" + br.readLine());
				} else {
					System.out.println("byebye");
				}
				s = br2.readLine();
			}
			if (br.readLine() == null) {
				System.out.println("bye");
			}
			br2.close();
			br.close();
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("监听错误！");
			System.exit(-1);
		}
	}
}
