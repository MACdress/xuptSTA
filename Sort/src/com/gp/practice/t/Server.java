package com.gp.practice.t;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//先启动SERVER，在写CLIENT。写的时候一边写SERVER，一边写CLIENT
public class Server {
	public static void main(String[] args) throws IOException {
		int p_num = 6666;// 端口号，通过哪个端口监听客户端链接
		ServerSocket ss = new ServerSocket(p_num);// 是阻塞式的，等待Client连接。之后写client,该端口以被占用
		while (true) {
			Socket s = ss.accept();// 接收链接,如果不接受，则client与Server的连接建立不起来，这个s专门和client做连接，即专门和client中的Socket做连接。
			// System.out.println("A 连接 成功");
			// s是客户端输入管道
			InputStream is = s.getInputStream();// 获得输入管道，即获得client的输入管道。
			DataInputStream dis = new DataInputStream(is);
			System.out.println(dis.readUTF());// 阻塞式的，如果不写东西，这里也在等着。
			dis.close();
			s.close();
			ss.close();
		}
	}
}
