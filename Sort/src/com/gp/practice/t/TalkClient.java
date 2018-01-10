package com.gp.practice.t;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TalkClient {
	public static void main(String[] args) {
		int p_num = 1234;
		try {
			System.out.println("正在连接");
			Socket ss = new Socket("127.0.0.1", p_num);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					ss.getInputStream()));
			BufferedReader br2 = new BufferedReader(new InputStreamReader(
					System.in));
			PrintWriter pw = new PrintWriter(ss.getOutputStream());
			String s = null;
			s = br2.readLine();
			while (s.equals("byebye") != true) {
				System.out.println("Client:" + s);
				pw.println(s);
				pw.flush();
				System.out.println();
				System.out.println("Server:" + br.readLine());
				s = br2.readLine();
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
