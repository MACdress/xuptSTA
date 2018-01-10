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
		// ���������������
		response.setHeader("pragma", "no-cache");
		response.setHeader("cache-control", "no-cache");
		response.setHeader("expires", "0");
		// Test1(response);��дһ����֤��
		ValidateCode vc = new ValidateCode(110, 25, 4, 10);
		vc.write(response.getOutputStream());
	}

	@SuppressWarnings("unused")
	private void Test1(HttpServletResponse response) throws IOException {
		int width = 100;
		int height = 25;
		// ���ڴ��д���һ��ͼƬ����
		BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		// ����һ������
		Graphics g = img.getGraphics();
		// ��ͼƬ��ӱ���
		g.setColor(Color.gray);// ����һ����ɫ
		g.fillRect(1, 1, width - 2, height - 2);// �����ɫ
		// ���߿�һ����ɫ
		g.setColor(Color.red);// ���ñ߿���ɫ
		g.drawRect(0, 0, width - 1, height - 1);// ���ñ߿�����
		// �����ı���ʽ
		g.setFont(new Font("����", Font.BOLD | Font.ITALIC, 15));
		// ����ı�����
		Random rand = new Random();
		// ��Ӿ���������
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
		// ��ͼƬ���������ķ�ʽ���ͻ���
		ImageIO.write(img, "jpg", response.getOutputStream());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
