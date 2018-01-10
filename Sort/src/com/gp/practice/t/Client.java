package com.gp.practice.t;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException,
			IOException, InterruptedException {
		String ip = "127.0.0.1";// 要连接的Ip地址
		int p_num = 6666;// 要连接的端口
		Socket s = new Socket(ip, p_num);// client与server监理链接;client的端口，系统随机选一个。申请链接
		// 多个客户端可以链接一个Server，等待Server接受。此时，s就是client和server端建立的一根管道。
		// 通过管道和流进行数据传输（链接管道里面有输出管道和输入管道）
		OutputStream os = s.getOutputStream();// client一般是往外输出（获得输出管道）
		DataOutputStream dos = new DataOutputStream(os);
		Thread.sleep(3000);
		// dos.writeUTF("HELLO SERVER");// 向服务器端输出一句话。以UTF-8的形式写出一句话
		dos.flush();
		dos.close();
		s.close();// s本身也是一根管道，也需要关闭。
	}
}
