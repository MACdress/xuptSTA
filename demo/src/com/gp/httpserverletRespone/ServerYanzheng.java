package com.gp.httpserverletRespone;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.dsna.util.images.ValidateCode;

/**
 * Servlet implementation class ServerYanzheng
 */
@WebServlet("/ServerYanzheng")
public class ServerYanzheng extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 告诉浏览器不缓存
		response.setHeader("pragma", "no-cache");
		response.setHeader("cache-control", "no-cache");
		response.setHeader("expires", "0");
		// Test1(response);手写一个验证码
		ValidateCode vc = new ValidateCode(110, 25, 4, 10);
		vc.write(response.getOutputStream());
	}

	@SuppressWarnings("unused")
	private void Test1(HttpServletResponse response) throws IOException {
		int width = 100;
		int height = 25;
		// 在内存中创建一个图片对象
		BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		// 创建一个画笔
		Graphics g = img.getGraphics();
		// 给图片添加背景
		g.setColor(Color.gray);// 设置一个颜色
		g.fillRect(1, 1, width - 2, height - 2);// 填充颜色
		// 给边框一个颜色
		g.setColor(Color.red);// 设置边框颜色
		g.drawRect(0, 0, width - 1, height - 1);// 设置边框坐标
		// 设置文本格式
		g.setFont(new Font("宋体", Font.BOLD | Font.ITALIC, 15));
		// 添加文本内容
		Random rand = new Random();
		// 添加九条干扰线
		g.setColor(Color.lightGray);
		for (int i = 0; i < 9; i++) {
			g.drawLine(rand.nextInt(width), rand.nextInt(height), rand.nextInt(width), rand.nextInt(height));
		}
		int x = 20;
		int y = 20;
		g.setColor(Color.black);
		for (int i = 0; i < 4; i++) {
			g.drawString(rand.nextInt(10) + "", x + i * 20, y);
		}
		// 将图片对象以留的方式给客户端
		ImageIO.write(img, "jpg", response.getOutputStream());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
